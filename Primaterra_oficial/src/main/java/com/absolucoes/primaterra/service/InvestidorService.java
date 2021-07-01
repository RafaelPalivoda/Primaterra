package com.absolucoes.primaterra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.absolucoes.primaterra.domain.Investidor;
import com.absolucoes.primaterra.dtos.InvestidorDTO;
import com.absolucoes.primaterra.repositories.InvestidorRepository;
import com.absolucoes.primaterra.service.exceptions.ObjectNotFoundException;

@Service
public class InvestidorService {
	@Autowired
	private InvestidorRepository repository;
	
	public Investidor findById(Integer id) {
		Optional<Investidor> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Investidor não encontrado!"));
	}

	public List<Investidor> findAll() {
		return repository.findAll();
	}
	public Investidor create(Investidor obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	public Investidor update(Integer id, InvestidorDTO objDTO) {
		Investidor obj = findById(id);
		obj.setNome(objDTO.getNome());
		obj.setAtividadePrincipal(objDTO.getAtividadePrincipal());
		obj.setAtividadeSecundaria(objDTO.getAtividadeSecundaria());
		obj.setCnpj(objDTO.getCnpj());
		obj.setFantasia(objDTO.getFantasia());
		obj.setSituacao(objDTO.getSituacao());
		obj.setTipo(objDTO.getTipo());
		return repository.save(obj);
	}
	public void delete(Integer id) {
		findById(id);
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new com.absolucoes.primaterra.service.exceptions.DataIntegrityViolationException(
					"Investidor não pode ser deletado!");
		}
	}
}
