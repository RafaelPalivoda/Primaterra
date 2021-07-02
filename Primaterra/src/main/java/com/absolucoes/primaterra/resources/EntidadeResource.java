package com.absolucoes.primaterra.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.absolucoes.primaterra.domains.Entidade;
import com.absolucoes.primaterra.dtos.EntidadeDTO;
import com.absolucoes.primaterra.services.EntidadeService;

@RestController
@RequestMapping(value="/entidade")
public class EntidadeResource {

	@Autowired
	private EntidadeService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Entidade> findById(@PathVariable Integer id){
		Entidade obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	@GetMapping
	public ResponseEntity<List<EntidadeDTO>> findAll(){
		List<Entidade> list = service.findAll();
		List<EntidadeDTO> listDTO = list.stream().map(obj -> new EntidadeDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	@PostMapping
	public ResponseEntity<Entidade> create(@RequestBody Entidade obj){
		obj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	@PatchMapping(value="/{id}")
	public ResponseEntity<EntidadeDTO> update(@PathVariable Integer id, @RequestBody EntidadeDTO objDTO){
		Entidade newObj = service.update(id ,objDTO);
		return ResponseEntity.ok().body(new EntidadeDTO(newObj));
	}
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
