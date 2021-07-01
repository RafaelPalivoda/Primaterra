package com.absolucoes.primaterra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.absolucoes.primaterra.domain.Terreneiro;
import com.absolucoes.primaterra.dtos.TerreneiroDTO;
import com.absolucoes.primaterra.repositories.TerreneiroRepository;
import com.absolucoes.primaterra.service.exceptions.DataIntegrityViolationException;
import com.absolucoes.primaterra.service.exceptions.ObjectNotFoundException;

@Service
public class TerreneiroService {

	@Autowired
	private TerreneiroRepository repository;
	
	public Terreneiro findById(Integer terreneiro_id) {
		Optional<Terreneiro> obj = repository.findById(terreneiro_id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Terreneiro não encontrado!"));
	}
	public List<Terreneiro> findAll(){
		return repository.findAll();
	}
	public Terreneiro update(Integer terreneiro_id, TerreneiroDTO objDTO) {
		Terreneiro obj = findById(terreneiro_id);
		obj.setCpf(objDTO.getCpf());
		obj.setRg(objDTO.getRg());
		obj.setDtNascimento(objDTO.getDtNascimento());
		obj.setNome(objDTO.getNome());
		obj.setNomeMae(objDTO.getNomeMae());
		obj.setEstrangeiro(objDTO.getEstrangeiro());
		obj.setOcupacao(objDTO.getOcupacao());
		return repository.save(obj);
	}
	public void delete(Integer terreneiro_id) {
		findById(terreneiro_id);
		try {
			repository.deleteById(terreneiro_id);
		} catch (DataIntegrityViolationException e) {
			throw new com.absolucoes.primaterra.service.exceptions.DataIntegrityViolationException(
					"Terreneiro não pode ser deletado!");
		}
	}
}
