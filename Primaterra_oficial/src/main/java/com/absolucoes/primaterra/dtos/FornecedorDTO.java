package com.absolucoes.primaterra.dtos;

import com.absolucoes.primaterra.domain.Fornecedor;

public class FornecedorDTO {

	private Integer fornecedor_id;
	private Long cnpj;
	private String tipo, nome, fantasia, atividadePrincipal, atividadeSecundaria, situacao;
	public FornecedorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FornecedorDTO(Fornecedor obj) {
		super();
		this.fornecedor_id = obj.getId();
		this.cnpj = obj.getCnpj();
		this.tipo = obj.getTipo();
		this.nome = obj.getNome();
		this.fantasia = obj.getFantasia();
		this.atividadePrincipal = obj.getAtividadePrincipal();
		this.atividadeSecundaria = obj.getAtividadeSecundaria();
		this.situacao = obj.getSituacao();
	}
	public Integer getFornecedorId() {
		return fornecedor_id;
	}
	public void setFornecedorId(Integer fornecedor_id) {
		this.fornecedor_id = fornecedor_id;
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
	
}
