package br.com.kentec.speedyfood.dto;

import br.com.kentec.speedyfood.domain.ItemProduto;

public class ItemProdutoDTO {
	
	private Long idItem;
	private String descricaoItem;
	private String tamanhoItem;
	private String unidadeMedidaItem; 
	private Boolean variedadeItem;
	private String descricaoVariedadeItem;
	
	public ItemProdutoDTO() {
		
	}
	
	public ItemProdutoDTO(ItemProduto itemProduto) {
		this.idItem = itemProduto.getId();
		this.descricaoItem = itemProduto.getDescricao();
		this.tamanhoItem = itemProduto.getTamanho();
		this.unidadeMedidaItem = itemProduto.getUnidadeMedida();
		this.variedadeItem = itemProduto.getVariedade();
	}

	public Long getIdItem() {
		return idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public String getTamanhoItem() {
		return tamanhoItem;
	}

	public void setTamanhoItem(String tamanhoItem) {
		this.tamanhoItem = tamanhoItem;
	}

	public String getUnidadeMedidaItem() {
		return unidadeMedidaItem;
	}

	public void setUnidadeMedidaItem(String unidadeMedidaItem) {
		this.unidadeMedidaItem = unidadeMedidaItem;
	}
	
	public Boolean getVariedadeItem() {
		return variedadeItem;
	}

	public void setVariedadeItem(Boolean variedade) {
		this.variedadeItem = variedade;
	}
	
	public String getDescricaoVariedadeItem() {
		return descricaoVariedadeItem;
	}

	public void setDescricaoVariedadeItem(String descricaoVariedadeItem) {
		this.descricaoVariedadeItem = descricaoVariedadeItem;
	}

	@Override
	public String toString() {
		return "ItemProdutoDTO [idItem=" + idItem + ", descricaoItem=" + descricaoItem + ", tamanhoItem=" + tamanhoItem
				+ ", unidadeMedidaItem=" + unidadeMedidaItem + ", variedadeItem=" + variedadeItem
				+ ", descricaoVariedadeItem=" + descricaoVariedadeItem + "]";
	}

	
}
