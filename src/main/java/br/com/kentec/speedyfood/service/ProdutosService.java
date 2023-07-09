package br.com.kentec.speedyfood.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.kentec.speedyfood.domain.ProdutoItem;
import br.com.kentec.speedyfood.domain.Produtos;
import br.com.kentec.speedyfood.dto.ProdutoItemDTO;
import br.com.kentec.speedyfood.dto.ProdutosDTO;
import br.com.kentec.speedyfood.repository.ProdutoItemRepository;
import br.com.kentec.speedyfood.repository.ProdutosRepository;

@Service
public class ProdutosService {
	
	@Autowired
	private ProdutosRepository pr;
	
	@Autowired
	private ProdutoItemRepository pir;
	
	public Optional<ProdutosDTO> findById(Long id){
		return pr.findById(id).map(ProdutosDTO::new);
	}
	
	public List<ProdutosDTO> listarProduto(){
		return pr.findAll().stream().map(ProdutosDTO::new).collect(Collectors.toList());
	}
	
	public ProdutosDTO create(ProdutosDTO produtoDTO) {
		Produtos produto = new Produtos();
		produto.setDescricao(produtoDTO.getDescricao());
		produto.setUnidadeMedida(produtoDTO.getUnidadeMedida());
		produto.setTamanho(produtoDTO.getTamanho()); 
		return new ProdutosDTO(pr.save(produto));
	}
	
	
	public void update(ProdutosDTO produtoDTO) {
		
		Produtos produto = pr.findById(produtoDTO.getId()).orElseThrow(()->
		new ResponseStatusException(HttpStatus.BAD_REQUEST, "Produto não Encontrado"));
		
			produto.setDescricao(produtoDTO.getDescricao());
			produto.setUnidadeMedida(produtoDTO.getUnidadeMedida());
			produto.setTamanho(produtoDTO.getTamanho());
			
			pr.save(produto);
	}
	
	public void updateProdutoItem(ProdutoItemDTO produtoItemDTO) {
		Optional<ProdutoItem> pic =  pir.findById(produtoItemDTO.getId());
		
		if(pic.isPresent()) {
			pic.get().setLayout(produtoItemDTO.getLayout());
			pic.get().setPosicao(produtoItemDTO.getPosicao());
			pic.get().setApresentar(produtoItemDTO.getApresentacao());
			
			pir.save(pic.get());
		}
	}

}
