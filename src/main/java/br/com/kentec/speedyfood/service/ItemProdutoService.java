package br.com.kentec.speedyfood.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.kentec.speedyfood.domain.ItemProduto;
import br.com.kentec.speedyfood.domain.VariedadeItem;
import br.com.kentec.speedyfood.dto.ItemProdutoDTO;
import br.com.kentec.speedyfood.repository.ItemProdutoRespository;
import br.com.kentec.speedyfood.repository.VariedadeItemRepository;

@Service
public class ItemProdutoService {
	
	@Autowired
	private ItemProdutoRespository ipr;
	
	@Autowired
	private VariedadeItemRepository vir;
	
	public List<ItemProdutoDTO> listarItemProduto(){
		return ipr.findAll().stream().map(ItemProdutoDTO::new).collect(Collectors.toList());
	}
	
	public Optional<ItemProdutoDTO> itemProduto(Long id){
		return ipr.findById(id).map(ItemProdutoDTO::new);
	}
	
	public Iterable<VariedadeItem> listarVariedadeItem(Long idItem){
		return vir.listarVariedadeItem(idItem);
	}
	
	public ItemProdutoDTO create(ItemProdutoDTO itemProdutoDTO) {
			
		ItemProduto itemProduto = new ItemProduto();
		
		itemProduto.setDescricao(itemProdutoDTO.getDescricaoItem());
		itemProduto.setTamanho(itemProdutoDTO.getTamanhoItem());
		itemProduto.setUnidadeMedida(itemProdutoDTO.getUnidadeMedidaItem());
		return new ItemProdutoDTO(ipr.save(itemProduto));
	}
	
	public void update(ItemProdutoDTO itemProdutoDTO) {
		Optional<ItemProduto> ip = ipr.findById(itemProdutoDTO.getIdItem());
		
		if(ip.isPresent()) {
			ip.get().setDescricao(itemProdutoDTO.getDescricaoItem());
			ip.get().setTamanho(itemProdutoDTO.getTamanhoItem());
			ip.get().setUnidadeMedida(itemProdutoDTO.getUnidadeMedidaItem());
			ip.get().setVariedade(itemProdutoDTO.getVariedadeItem());
			
			ipr.save(ip.get());
		}
	}
	
	public void incluirVariedadeItem(String descricaoVariedadeItem, Boolean variedadeItem, BigDecimal valorVariedadeItem, Long idItem) {
		Optional<ItemProduto> ip = ipr.findById(idItem);
		if(ip.isPresent()){
				ip.get().setVariedade(variedadeItem);
				ipr.save(ip.get());
			VariedadeItem vi = new VariedadeItem();
			vi.setDescricao(descricaoVariedadeItem);
			vi.setItemProduto(ip.get());
			vi.setValor(valorVariedadeItem);
			vir.save(vi);
		}
	}
	
	public void removeVariedadeItem(Long idVariedade) {
		vir.deleteById(idVariedade);
	}
}
