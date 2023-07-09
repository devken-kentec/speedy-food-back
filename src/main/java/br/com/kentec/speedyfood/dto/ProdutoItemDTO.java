package br.com.kentec.speedyfood.dto;

import br.com.kentec.speedyfood.domain.ProdutoItem;

public class ProdutoItemDTO {
	
	private Long id;
	private String descricaoItem;
	private String unidadeMedidaItem;
	private String tamanhoItem;
	private String layout;
	private Integer posicao;
	private Boolean apresentacao;
	
	
	public ProdutoItemDTO() {
		
	}
	
	public ProdutoItemDTO(ProdutoItem produtoItem){
		this.id = produtoItem.getId();
		this.descricaoItem = produtoItem.getItemProduto().getDescricao();
		this.unidadeMedidaItem = produtoItem.getItemProduto().getUnidadeMedida();
		this.tamanhoItem = produtoItem.getItemProduto().getTamanho();
		this.layout = produtoItem.getLayout();
		this.posicao = produtoItem.getPosicao();
		this.apresentacao = produtoItem.getApresentar();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public String getUnidadeMedidaItem() {
		return unidadeMedidaItem;
	}

	public void setUnidadeMedidaItem(String unidadeMedidaItem) {
		this.unidadeMedidaItem = unidadeMedidaItem;
	}

	public String getTamanhoItem() {
		return tamanhoItem;
	}

	public void setTamanhoItem(String tamanhoItem) {
		this.tamanhoItem = tamanhoItem;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public Boolean getApresentacao() {
		return apresentacao;
	}

	public void setApresentacao(Boolean apresentacao) {
		this.apresentacao = apresentacao;
	}

	@Override
	public String toString() {
		return "ProdutoItemDTO [id=" + id + ", descricaoItem=" + descricaoItem + ", unidadeMedidaItem="
				+ unidadeMedidaItem + ", tamanhoItem=" + tamanhoItem + ", layout=" + layout + ", posicao=" + posicao
				+ ", apresentacao=" + apresentacao + "]";
	}
}
