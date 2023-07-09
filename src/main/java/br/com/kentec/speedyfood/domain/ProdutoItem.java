package br.com.kentec.speedyfood.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="produto_item")
@SuppressWarnings("serial")
public class ProdutoItem implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="layout", nullable = true, length = 20)
	private String layout;
	
	@Column(name="posicao", nullable = true, length = 5)
	private Integer posicao;
	
	@Column(name="apresentar", nullable = true)
	private Boolean apresentar;
	
	@ManyToOne
	@JoinColumn(name="id_produto", nullable = true)
	private Produtos produto = new Produtos();
	
	@ManyToOne
	@JoinColumn(name="id_item_produto", nullable = true)
	private ItemProduto itemProduto = new ItemProduto();
	
	public ProdutoItem() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}

	public ItemProduto getItemProduto() {
		return itemProduto;
	}

	public void setItemProduto(ItemProduto itemProduto) {
		this.itemProduto = itemProduto;
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
	
	public Boolean getApresentar() {
		return apresentar;
	}

	public void setApresentar(Boolean apresentar) {
		this.apresentar = apresentar;
	}

	@Override
	public String toString() {
		return "ProdutoItem [id=" + id + ", layout=" + layout + ", posicao=" + posicao + ", apresentar=" + apresentar
				+ ", produto=" + produto + ", itemProduto=" + itemProduto + "]";
	}
	
}
