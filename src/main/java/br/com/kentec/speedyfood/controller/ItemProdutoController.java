package br.com.kentec.speedyfood.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.speedyfood.domain.VariedadeItem;
import br.com.kentec.speedyfood.dto.ItemProdutoDTO;
import br.com.kentec.speedyfood.service.ItemProdutoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("speedyfood/api/itemproduto")
public class ItemProdutoController {
	
	@Autowired
	private ItemProdutoService ips;
	
	@GetMapping()
	public ResponseEntity<List<ItemProdutoDTO>> listarItemProduto(){
		return ResponseEntity.ok(ips.listarItemProduto());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<ItemProdutoDTO>> ItemProduto(@PathVariable("id") Long id){
		return ResponseEntity.ok(ips.itemProduto(id));
	}
	
	@GetMapping("/variedade/{idItem}")
	public ResponseEntity<Iterable<VariedadeItem>> listarVariedadeItem(@PathVariable("idItem") Long idItem){
		return ResponseEntity.ok(ips.listarVariedadeItem(idItem));
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public ItemProdutoDTO create(@RequestBody ItemProdutoDTO itemProdutoDTO) {
		return ips.create(itemProdutoDTO);
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@RequestBody ItemProdutoDTO itemProdutoDTO) {
		ips.update(itemProdutoDTO);
	}
	
	@GetMapping("/{descricaoVariedadeItem}/{variedadeItem}/{valorVariedadeItem}/{idItem}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void incluirVariedadeItem(@PathVariable("descricaoVariedadeItem") String descricaoVariedadeItem, 
									 @PathVariable("variedadeItem") Boolean variedadeItem, 
									 @PathVariable("valorVariedadeItem") BigDecimal valorVariedadeItem,
									 @PathVariable("idItem") Long idItem) {
		ips.incluirVariedadeItem(descricaoVariedadeItem, variedadeItem, valorVariedadeItem, idItem); 
	}
	
	@DeleteMapping("/{idVariedade}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removeVariedadeItem(@PathVariable("idVariedade") Long idVariedade) {
		ips.removeVariedadeItem(idVariedade);
	}

}
