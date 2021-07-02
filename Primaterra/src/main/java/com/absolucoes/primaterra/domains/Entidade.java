package com.absolucoes.primaterra.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Long cnpj;
	private String tipo, nome, fantasia, atividadePrincipal, atividadeSecundaria, situacao;
	private Integer cpf, rg;
	private String dtNascimento, nomeMae, sexo, ocupacao;
	private Boolean estrangeiro, isPrestador, isInvestidor, isTerreneiro;

	public Entidade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entidade(Integer id, Long cnpj, String tipo, String nome, String fantasia, String atividadePrincipal,
			String atividadeSecundaria, String situacao, Integer cpf, Integer rg, String dtNascimento, String nomeMae,
			String sexo, String ocupacao, Boolean estrangeiro, Boolean isPrestador, Boolean isInvestidor,
			Boolean isTerreneiro) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.tipo = tipo;
		this.nome = nome;
		this.fantasia = fantasia;
		this.atividadePrincipal = atividadePrincipal;
		this.atividadeSecundaria = atividadeSecundaria;
		this.situacao = situacao;
		this.cpf = cpf;
		this.rg = rg;
		this.dtNascimento = dtNascimento;
		this.nomeMae = nomeMae;
		this.sexo = sexo;
		this.ocupacao = ocupacao;
		this.estrangeiro = estrangeiro;
		this.isPrestador = isPrestador;
		this.isInvestidor = isInvestidor;
		this.isTerreneiro = isTerreneiro;
	}

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

	public Boolean getIsPrestador() {
		return isPrestador;
	}

	public void setIsPrestador(Boolean isPrestador) {
		this.isPrestador = isPrestador;
	}

	public Boolean getIsInvestidor() {
		return isInvestidor;
	}

	public void setIsInvestidor(Boolean isInvestidor) {
		this.isInvestidor = isInvestidor;
	}

	public Boolean getIsTerreneiro() {
		return isTerreneiro;
	}

	public void setIsTerreneiro(Boolean isTerreneiro) {
		this.isTerreneiro = isTerreneiro;
	}

}
