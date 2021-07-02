package com.absolucoes.primaterra.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.absolucoes.primaterra.domains.Entidade;
import com.absolucoes.primaterra.dtos.EntidadeDTO;
import com.absolucoes.primaterra.repositories.EntidadeRepository;
import com.absolucoes.primaterra.services.exceptions.ObjectNotFoundException;

@Service
public class EntidadeService {

	@Autowired
	private EntidadeRepository repository;

	public Entidade findById(Integer id) {
		Optional<Entidade> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Entidade não encontrado!"));
	}

	public List<Entidade> findAll() {
		return repository.findAll();
	}

	public Entidade create(Entidade obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public Entidade update(Integer id, EntidadeDTO objDTO) {
		Entidade obj = findById(id);
		obj.setNome(objDTO.getNome());
		obj.setCnpj(objDTO.getCnpj());
		obj.setCpf(objDTO.getCpf());
		obj.setFantasia(objDTO.getFantasia());
		obj.setDtNascimento(objDTO.getDtNascimento());
		obj.setEstrangeiro(objDTO.getEstrangeiro());
		obj.setAtividadePrincipal(objDTO.getAtividadePrincipal());
		obj.setAtividadeSecundaria(objDTO.getAtividadeSecundaria());
		obj.setRg(objDTO.getRg());
		obj.setIsInvestidor(objDTO.getIsInvestidor());
		obj.setIsPrestador(objDTO.getIsPrestador());
		obj.setIsTerreneiro(objDTO.getIsTerreneiro());
		obj.setNomeMae(objDTO.getNomeMae());
		obj.setOcupacao(objDTO.getOcupacao());
		obj.setSexo(objDTO.getSexo());
		obj.setSituacao(objDTO.getSituacao());
		obj.setTipo(objDTO.getTipo());
		return repository.save(obj);
	}

	public void delete(Integer id) {
		findById(id);
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new com.absolucoes.primaterra.services.exceptions.DataIntegrityViolationException(
					"Entidade não pode ser deletada!");
		}
	}

}
