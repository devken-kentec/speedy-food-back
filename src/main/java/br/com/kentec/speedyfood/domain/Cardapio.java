package br.com.kentec.speedyfood.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name="cardapio")
@SuppressWarnings("serial")
public class Cardapio implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="valor", nullable = true, precision = 10, scale = 2)
	private BigDecimal valor;
	
	@Column(name="status_cardapio", nullable = true, length = 15)
	private String statusCardapio;
	
	@ManyToOne
	@JoinColumn(name="id_produto", nullable = false)
	private Produtos produto = new Produtos();
	
	public Cardapio() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getStatusCardapio() {
		return statusCardapio;
	}

	public void setStatusCardapio(String statusCardapio) {
		this.statusCardapio = statusCardapio;
	}

	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Cardapio [id=" + id + ", valor=" + valor + ", statusCardapio=" + statusCardapio + ", produto=" + produto
				+ "]";
	}

}
