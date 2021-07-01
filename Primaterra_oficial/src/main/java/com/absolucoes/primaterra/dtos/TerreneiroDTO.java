package com.absolucoes.primaterra.dtos;

import com.absolucoes.primaterra.domain.Terreneiro;

public class TerreneiroDTO {
	private Integer terreneiro_id;
	private Integer cpf, rg;
	private String nome, dtNascimento, nomeMae, sexo, ocupacao;
	private Boolean estrangeiro;
	public TerreneiroDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TerreneiroDTO(Terreneiro obj) {
		super();
		this.terreneiro_id = obj.getterreneiro_id();
		this.cpf = obj.getCpf();
		this.rg = obj.getRg();
		this.nome = obj.getNome();
		this.dtNascimento = obj.getDtNascimento();
		this.nomeMae = obj.getNomeMae();
		this.sexo = obj.getSexo();
		this.ocupacao = obj.getOcupacao();
		this.estrangeiro = obj.getEstrangeiro();
	}
	public Integer getTerreneiro_id() {
		return terreneiro_id;
	}
	public void setTerreneiro_id(Integer terreneiro_id) {
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
	
}
