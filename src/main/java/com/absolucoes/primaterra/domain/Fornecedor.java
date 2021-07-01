package com.absolucoes.primaterra.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Fornecedor implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Long cnpj;
	private String tipo, nome, fantasia, atividadePrincipal, atividadeSecundaria, situacao;
	@JsonIgnore
	@OneToMany(mappedBy="contato")
	private List<Contato> contato = new ArrayList<>();
	@JsonIgnore
	@OneToMany(mappedBy="fornecedor")
	private List<Endereco> endereco = new ArrayList<>();
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getCnpj() {
		return cnpj;
	}
	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFantasia() {
		return fantasia;
	}
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	public String getAtividadePrincipal() {
		return atividadePrincipal;
	}
	public void setAtividadePrincipal(String atividadePrincipal) {
		this.atividadePrincipal = atividadePrincipal;
	}
	public String getAtividadeSecundaria() {
		return atividadeSecundaria;
	}
	public void setAtividadeSecundaria(String atividadeSecundaria) {
		this.atividadeSecundaria = atividadeSecundaria;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public List<Contato> getContato() {
		return contato;
	}
	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}
	public List<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fornecedor(Integer id, Long cnpj, String tipo, String nome, String fantasia, String atividadePrincipal,
			String atividadeSecundaria, String situacao) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.tipo = tipo;
		this.nome = nome;
		this.fantasia = fantasia;
		this.atividadePrincipal = atividadePrincipal;
		this.atividadeSecundaria = atividadeSecundaria;
		this.situacao = situacao;
	}
	
	
}