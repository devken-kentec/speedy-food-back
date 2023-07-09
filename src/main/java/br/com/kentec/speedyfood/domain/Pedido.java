package br.com.kentec.speedyfood.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="pedido")
@SuppressWarnings("serial")
public class Pedido implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="consumo", nullable = false, length = 30)
	private String consumo;
	
	@Column(name="dataHora", nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dataHora;
	
	@Column(name="tipoPagamento", nullable = false, length = 30)
	private String tipoPagemento;
	
	@Column(name="valorTotal", nullable = true, precision = 10, scale = 2)
	private BigDecimal valorTotal;
	
	@Column(name="statusPedido", nullable = false, length = 30)
	private String statusPedido;
	
	@Column(name="statusPagamento", nullable = false, length = 30)
	private String StatusPagamento;
	
	@ManyToOne
	@JoinColumn(name="id_cliente",  nullable = false)
	private Cliente cliente = new Cliente();
	
	public Pedido() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public LocalDate getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDate dataHora) {
		this.dataHora = dataHora;
	}

	public String getTipoPagemento() {
		return tipoPagemento;
	}

	public void setTipoPagemento(String tipoPagemento) {
		this.tipoPagemento = tipoPagemento;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public String getStatusPagamento() {
		return StatusPagamento;
	}

	public void setStatusPagamento(String statusPagamento) {
		StatusPagamento = statusPagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", consumo=" + consumo + ", dataHora=" + dataHora + ", tipoPagemento="
				+ tipoPagemento + ", valorTotal=" + valorTotal + ", statusPedido=" + statusPedido + ", StatusPagamento="
				+ StatusPagamento + ", cliente=" + cliente + "]";
	}
}