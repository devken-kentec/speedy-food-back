package br.com.kentec.speedyfood.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="item_produto")
@SuppressWarnings("serial")
public class ItemProduto implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="descricao", nullable = false, length = 250)
	private String descricao;
	
	@Column(name="tamanho", nullable = true, length = 30)
	private String tamanho;
	
	@Column(name="unidade_medida", nullable = true, length = 30)
	private String unidadeMedida;
	
	@Column(name="variedade", nullable = true)
	private Boolean variedade;
	
	public ItemProduto() {
		
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

	public Boolean getVariedade() {
		return variedade;
	}

	public void setVariedade(Boolean variedade) {
		this.variedade = variedade;
	}

	@Override
	public String toString() {
		return "ItemProduto [id=" + id + ", descricao=" + descricao + ", tamanho=" + tamanho + ", unidadeMedida="
				+ unidadeMedida + ", variedade=" + variedade + "]";
	}
}
