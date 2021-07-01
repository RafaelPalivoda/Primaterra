package com.absolucoes.primaterra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.absolucoes.primaterra.domain.Contato;
import com.absolucoes.primaterra.domain.Fornecedor;
import com.absolucoes.primaterra.repositories.ContatoRepository;
import com.absolucoes.primaterra.service.exceptions.ObjectNotFoundException;

@Service
public class ContatoService {
	@Autowired
	private ContatoRepository repository;
	
	@Autowired
	private FornecedorService fornecedorService;
	
	public Contato findById(Integer id) {
		Optional<Contato> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Contato não cadastrado!"));
	}
	
	public List<Contato> findAll(Integer id_forn) {
		fornecedorService.findByID(id_forn);
		return repository.findAllByFornecedor(id_forn);
	}

	public Contato update(Integer id, Contato obj) {
		Contato newObj = findById(id);
		updateData(newObj, obj);
		return repository.save(newObj);
	}

	private void updateData(Contato newObj, Contato obj) {
		newObj.setEmail(obj.getEmail());
		newObj.setTelefone(obj.getTelefone());
		
	}

	public Contato create(Integer id_forn, Contato obj) {
		obj.setContato_id(null);
		Fornecedor forn = fornecedorService.findByID(id_forn);
		obj.setFornecedor(forn);
		return repository.save(obj);
	}
	
	
}
