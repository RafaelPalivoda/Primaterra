package com.absolucoes.primaterra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.absolucoes.primaterra.domain.Fornecedor;
import com.absolucoes.primaterra.dtos.FornecedorDTO;
import com.absolucoes.primaterra.repositories.FornecedorRepository;
import com.absolucoes.primaterra.service.exceptions.ObjectNotFoundException;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository repository;
	
	public Fornecedor findByID(Integer fornecedor_id) {
		Optional<Fornecedor> obj = repository.findById(fornecedor_id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Fornecedor não encontrado!"));
	}
	
	public List<Fornecedor> findAll() {
		return repository.findAll();
	}

	public Fornecedor create(Fornecedor obj) {
		obj.setId(null);
		return repository.save(obj);
	} 

	public Fornecedor update(Integer fornecedor_id, FornecedorDTO objDTO) {
		Fornecedor obj = findByID(fornecedor_id);
		obj.setNome(objDTO.getNome());
		obj.setAtividadePrincipal(objDTO.getAtividadePrincipal());
		obj.setAtividadeSecundaria(objDTO.getAtividadeSecundaria());
		obj.setCnpj(objDTO.getCnpj());
		obj.setFantasia(objDTO.getFantasia());
		obj.setSituacao(objDTO.getSituacao());
		obj.setTipo(objDTO.getTipo());
		return repository.save(obj);
	}

	public void delete(Integer fornecedor_id) {
		findByID(fornecedor_id);
		try {
			repository.deleteById(fornecedor_id);
		} catch (DataIntegrityViolationException e) {
			throw new com.absolucoes.primaterra.service.exceptions.DataIntegrityViolationException(
					"Fornecedor não pode ser deletado!");
		}
	}
}
