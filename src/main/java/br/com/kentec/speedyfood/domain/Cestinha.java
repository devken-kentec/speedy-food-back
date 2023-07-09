package br.com.kentec.speedyfood.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="cestinha")
@SuppressWarnings("serial")
public class Cestinha implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="data", nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate data;
	
	@Column(name="quantidade", nullable = true, length = 10)
	private Integer quantidade;
	
	@Column(name="produtoComboCardapio", nullable = false, length = 250)
	private String produtoComboCardapio;
	
	@Column(name="valor", nullable = true, precision = 10, scale = 2)
	private BigDecimal valor;
	
	@Column(name="observacao", nullable = false, length = 500)
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name="id_pedido",  nullable = false)
	private Pedido pedido = new Pedido();
	
	public Cestinha() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getProdutoComboCardapio() {
		return produtoComboCardapio;
	}

	public void setProdutoComboCardapio(String produtoComboCardapio) {
		this.produtoComboCardapio = produtoComboCardapio;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "Cestinha [id=" + id + ", data=" + data + ", quantidade=" + quantidade + ", produtoComboCardapio="
				+ produtoComboCardapio + ", valor=" + valor + ", observacao=" + observacao + ", pedido=" + pedido + "]";
	}
}
