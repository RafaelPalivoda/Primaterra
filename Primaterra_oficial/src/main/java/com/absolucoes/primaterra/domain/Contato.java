package com.absolucoes.primaterra.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Contato implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer contato_id;	
	private String email;
	private Integer telefone;
	@JsonIgnore
	@OneToMany(mappedBy = "contato")
	private List<Endereco> endereco = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name = "contato")
	private Fornecedor fornecedor;
	
	public Integer getContatoId() {
		return contato_id;
	}
	public void setContatoId(Integer contato_id) {
		this.contato_id = contato_id;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getContato_id() {
		return contato_id;
	}
	public void setContato_id(Integer contato_id) {
		this.contato_id = contato_id;
	}
	
	public List<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contato(Integer contato_id, String email, Integer telefone, List<Endereco> endereco) {
		super();
		this.contato_id = contato_id;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	
}
