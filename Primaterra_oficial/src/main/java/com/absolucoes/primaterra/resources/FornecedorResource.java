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

import com.absolucoes.primaterra.domain.Fornecedor;
import com.absolucoes.primaterra.dtos.FornecedorDTO;
import com.absolucoes.primaterra.service.FornecedorService;

@RestController
@RequestMapping(value="/fornecedor")
public class FornecedorResource {
	
	@Autowired
	private FornecedorService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Fornecedor> findByID(@PathVariable Integer fornecedor_id){
		Fornecedor obj = service.findByID(fornecedor_id);
		return ResponseEntity.ok().body(obj);
	}
	@GetMapping
	public ResponseEntity<List<FornecedorDTO>> findAll(){
		List<Fornecedor> list = service.findAll();
		List<FornecedorDTO> listDTO = list.stream().map(obj -> new FornecedorDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	@PostMapping
	public ResponseEntity<Fornecedor> create(@RequestBody Fornecedor obj){
		obj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	@PatchMapping(value = "/{id}")
	public ResponseEntity<FornecedorDTO> updatePatch(@PathVariable Integer fornecedor_id, @RequestBody FornecedorDTO objDTO){
		Fornecedor newObj = service.update(fornecedor_id, objDTO);
		return ResponseEntity.ok().body(new FornecedorDTO(newObj));	
	}
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer fornecedor_id){
		service.delete(fornecedor_id);	
		return ResponseEntity.noContent().build();
	}
}
