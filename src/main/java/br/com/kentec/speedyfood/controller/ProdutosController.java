package br.com.kentec.speedyfood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.speedyfood.dto.ProdutoItemDTO;
import br.com.kentec.speedyfood.dto.ProdutosDTO;
import br.com.kentec.speedyfood.service.ProdutoItemService;
import br.com.kentec.speedyfood.service.ProdutosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("speedyfood/api/produto")
public class ProdutosController {
	
	@Autowired
	private ProdutosService ps;
	
	@Autowired
	private ProdutoItemService pis;
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<ProdutosDTO>> findById(@PathVariable("id") Long id){
		return ResponseEntity.ok(ps.findById(id));
	}
	
	@GetMapping()
	public ResponseEntity<List<ProdutosDTO>> listarProduto() {
		return ResponseEntity.ok(ps.listarProduto());
	}
	
	@GetMapping("/listarProdutoItem/{id_produto}")
	public ResponseEntity<List<ProdutoItemDTO>> listarProdutoItem(@PathVariable Long id_produto){
		return ResponseEntity.ok(pis.listarProdutoItem(id_produto));
	}
	
	@GetMapping("/configurarProdutoItem/{id_produto_item}")
	public ResponseEntity<Optional<ProdutoItemDTO>> configurarProdutoItem(@PathVariable Long id_produto_item){
		return ResponseEntity.ok(pis.configurarProdutoItem(id_produto_item));
	}
	
	@GetMapping("/gerarProdutoItem")
	@ResponseStatus(HttpStatus.CREATED)
	public void gerarProdutoItem(@RequestParam("id") Long id, @RequestParam("item") Long item) {
		pis.gerarProdutoItem(id, item);
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public ProdutosDTO create(@RequestBody ProdutosDTO produtoDTO ) {
		return ps.create(produtoDTO) ;
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@RequestBody ProdutosDTO produtoDTO ) {
		ps.update(produtoDTO);
	}
	
	@PutMapping("/configurarProdutoItem")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateProdutoItem(@RequestBody ProdutoItemDTO produtoItemDTO ) {
		ps.updateProdutoItem(produtoItemDTO);
	}
}
  



