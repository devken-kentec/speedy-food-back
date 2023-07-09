package br.com.kentec.speedyfood.dto;

import br.com.kentec.speedyfood.domain.Produtos;

public class ProdutosDTO {
	
	private Long id;
	private String descricao;
	private String tamanho;
	private String unidadeMedida;
	
	public ProdutosDTO(){
		
	}
	
	public ProdutosDTO(Produtos produto){
		this.id = produto.getId();
		this.descricao = produto.getDescricao();
		this.tamanho = produto.getTamanho();
		this.unidadeMedida = produto.getUnidadeMedida();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	@Override
	public String toString() {
		return "ProdutosDTO [id=" + id + ", descricao=" + descricao + ", tamanho=" + tamanho + ", unidadeMedida="
				+ unidadeMedida + "]";
	}

}
