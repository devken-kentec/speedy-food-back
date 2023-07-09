package br.com.kentec.speedyfood.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="produtos")
@SuppressWarnings("serial")
public class Produtos implements Serializable {
	
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
	
	public Produtos() {
		
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
		return "Produtos [id=" + id + ", descricao=" + descricao + ", tamanho=" + tamanho + ", unidadeMedida="
				+ unidadeMedida + "]";
	}
	
}
