package com.absolucoes.primaterra.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private Integer endereco_id;
	private Integer cep, numero;
	private String logradouro, comple, bairro, uf, cidade;
	@ManyToOne
	@JoinColumn(name="endereco")
	private Contato contato;
	@ManyToOne
	@JoinColumn(name="terreneiro_id")
	private Terreneiro terreneiro;
	@ManyToOne
	@JoinColumn(name="investidor_id")
	private Investidor investidor;
	@ManyToOne
	@JoinColumn(name="endereco")
	private Fornecedor fornecedor;
	
	public Integer getEnderecoId() {
		return endereco_id;
	}

	public void setEnderecoId(Integer endereco_id) {
		this.endereco_id = endereco_id;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComple() {
		return comple;
	}

	public void setComple(String comple) {
		this.comple = comple;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Contato getContato() {
		return contato;
	}
	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endereco(Integer endereco_id, Integer cep, Integer numero, String logradouro, String comple, String bairro, String uf,
			String cidade) {
		super();
		this.endereco_id = endereco_id;
		this.cep = cep;
		this.numero = numero;
		this.logradouro = logradouro;
		this.comple = comple;
		this.bairro = bairro;
		this.uf = uf;
		this.cidade = cidade;
	}

}
