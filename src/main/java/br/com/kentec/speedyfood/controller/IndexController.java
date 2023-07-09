package br.com.kentec.speedyfood.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.speedyfood.domain.Produtos;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping()
	public String get(@RequestBody List<Produtos> produto) {
		produto.forEach(c -> {
			System.out.println(c.getDescricao());
		});
		return "Peça sua comida aqui!";
	}

}