package com.absolucoes.primaterra.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Terreneiro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer terreneiro_id;
	private Integer cpf, rg;
	private String nome, dtNascimento, nomeMae, sexo, ocupacao;
	private Boolean estrangeiro;
	@JsonIgnore
	@OneToMany(mappedBy="terreneiro")
	private List<Endereco> endereco = new ArrayList<>();
	
	public Terreneiro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Terreneiro(Integer terreneiro_id, Integer cpf, Integer rg, String nome, String dtNascimento, String nomeMae,
			String sexo, String ocupacao, Boolean estrangeiro) {
		super();
		this.terreneiro_id = terreneiro_id;
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.nomeMae = nomeMae;
		this.sexo = sexo;
		this.ocupacao = ocupacao;
		this.estrangeiro = estrangeiro;
	}
	public Integer getterreneiro_id() {
		return terreneiro_id;
	}
	public void setterreneiro_id(Integer terreneiro_id) {
		this.terreneiro_id = terreneiro_id;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Integer getRg() {
		return rg;
	}
	public void setRg(Integer rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	public Boolean getEstrangeiro() {
		return estrangeiro;
	}
	public void setEstrangeiro(Boolean estrangeiro) {
		this.estrangeiro = estrangeiro;
	}
	public List<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
