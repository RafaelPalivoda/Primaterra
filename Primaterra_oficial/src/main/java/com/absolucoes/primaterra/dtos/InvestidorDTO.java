package com.absolucoes.primaterra.dtos;

import com.absolucoes.primaterra.domain.Investidor;

public class InvestidorDTO {

	private Integer id;
	private Integer cnpj;
	private String tipo, nome, fantasia, atividadePrincipal, atividadeSecundaria, situacao;
	public InvestidorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvestidorDTO(Investidor obj) {
		super();
		this.id = obj.getId();
		this.cnpj = obj.getCnpj();
		this.tipo = obj.getTipo();
		this.nome = obj.getNome();
		this.fantasia = obj.getFantasia();
		this.atividadePrincipal = obj.getAtividadePrincipal();
		this.atividadeSecundaria = obj.getAtividadeSecundaria();
		this.situacao = obj.getSituacao();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
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
	
	
}
