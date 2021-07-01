package com.absolucoes.primaterra.dtos;

import com.absolucoes.primaterra.domain.Contato;

public class ContatoDTO {

	private Integer contato_id;	
	private String email;
	private Integer telefone;
	public ContatoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContatoDTO(Contato obj) {
		super();
		this.contato_id = obj.getContato_id();
		this.email = obj.getEmail();
		this.telefone = obj.getTelefone();
	}
	public Integer getContato_id() {
		return contato_id;
	}
	public void setContato_id(Integer contato_id) {
		this.contato_id = contato_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	
}
