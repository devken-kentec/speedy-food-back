package br.com.kentec.speedyfood.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="cliente")
@SuppressWarnings("serial")
public class Cliente implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="nome", nullable = false, length = 350)
	private String nome;
	
	@Column(name="telefone", nullable = false, length = 20)
	private String telefone;
	
	@Column(name="email", nullable = true, length = 350)
	private String email;
	
	@ManyToOne
	@JoinColumn(name="id_setor", nullable = false)
	private Setor setor = new Setor();

	public Cliente() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", setor="
				+ setor + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getTelefone()=" + getTelefone()
				+ ", getEmail()=" + getEmail() + ", getSetor()=" + getSetor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
