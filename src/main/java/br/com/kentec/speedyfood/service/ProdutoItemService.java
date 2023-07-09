package br.com.kentec.speedyfood.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import br.com.kentec.speedyfood.domain.ItemProduto;
import br.com.kentec.speedyfood.domain.ProdutoItem;
import br.com.kentec.speedyfood.domain.Produtos;
import br.com.kentec.speedyfood.dto.ProdutoItemDTO;
import br.com.kentec.speedyfood.repository.ItemProdutoRespository;
import br.com.kentec.speedyfood.repository.ProdutoItemRepository;
import br.com.kentec.speedyfood.repository.ProdutosRepository;

@Service
public class ProdutoItemService {
	
	@Autowired
	private ProdutoItemRepository pir;
	
	@Autowired
	private ProdutosRepository pr;
	
	@Autowired
	private ItemProdutoRespository ipr;
	
	
	public List<ProdutoItemDTO> listarProdutoItem(Long id_produto){
		return pir.listarProdutoItem(id_produto).stream().map(ProdutoItemDTO::new).collect(Collectors.toList());
	}
	
	public Optional<ProdutoItemDTO> configurarProdutoItem(Long id_produto_item){
		return pir.findById(id_produto_item).map(ProdutoItemDTO :: new);
	}
	
	public void gerarProdutoItem(Long id, Long item){
		
		ProdutoItem produtoItem = new ProdutoItem();
			
		Produtos produto = pr.findById(id).orElseThrow(()->
		new ResponseStatusException(HttpStatus.BAD_REQUEST, "Produto não encontrado"));
		
		ItemProduto itemProduto = ipr.findById(item).orElseThrow(()->
		new ResponseStatusException(HttpStatus.BAD_REQUEST, "Item do produto não encontrado"));
		
		produtoItem.setProduto(produto);
		produtoItem.setItemProduto(itemProduto);
		
		pir.save(produtoItem);
	}	

}
