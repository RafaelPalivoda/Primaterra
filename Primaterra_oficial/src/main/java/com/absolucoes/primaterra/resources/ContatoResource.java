package com.absolucoes.primaterra.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.absolucoes.primaterra.domain.Contato;
import com.absolucoes.primaterra.dtos.ContatoDTO;
import com.absolucoes.primaterra.service.ContatoService;

@RestController
@RequestMapping(value="/contato")
public class ContatoResource {
	@Autowired
	private ContatoService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Contato> findById(@PathVariable Integer id){
		Contato obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	@GetMapping
	public ResponseEntity<List<ContatoDTO>> findAll(@RequestParam(value="fornecedor", defaultValue = "0") Integer id_forn){
		List<Contato> list = service.findAll(id_forn);
		List<ContatoDTO> listDTO = list.stream().map(obj -> new ContatoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	@PutMapping(value="/{id}")
	public ResponseEntity<Contato> update(@PathVariable Integer id, @RequestBody Contato obj){
		Contato newObj = service.update(id, obj);
		return ResponseEntity.ok().body(newObj);
	}
	@PatchMapping(value="/{id}")
	public ResponseEntity<Contato> updatePatch(@PathVariable Integer id, @RequestBody Contato obj){
		Contato newObj = service.update(id, obj);
		return ResponseEntity.ok().body(newObj);
	}
	@PostMapping
	public ResponseEntity<Contato> create(@RequestParam(value="fornecedor", defaultValue="0")Integer id_forn, @RequestBody Contato obj){
		Contato newObj = service.create(id_forn, obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/contato/{id}").buildAndExpand(newObj.getContato_id()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
