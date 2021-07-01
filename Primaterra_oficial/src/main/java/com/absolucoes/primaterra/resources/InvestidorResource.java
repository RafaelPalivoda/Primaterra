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

import com.absolucoes.primaterra.domain.Investidor;
import com.absolucoes.primaterra.dtos.InvestidorDTO;
import com.absolucoes.primaterra.service.InvestidorService;

@RestController
@RequestMapping(value="/investidor")
public class InvestidorResource {
	
	@Autowired
	private InvestidorService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Investidor> findByID(@PathVariable Integer id){
		Investidor obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	@GetMapping
	public ResponseEntity<List<InvestidorDTO>> findAll(){
		List<Investidor> list = service.findAll();
		List<InvestidorDTO> listDTO = list.stream().map(obj -> new InvestidorDTO()).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	@PostMapping
	public ResponseEntity<Investidor> create(@RequestBody Investidor obj){
		obj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	@PatchMapping(value = "/{id}")
	public ResponseEntity<InvestidorDTO> update(@PathVariable Integer id, @RequestBody InvestidorDTO objDTO){
		Investidor newObj = service.update(id, objDTO);
		return ResponseEntity.ok().body(new InvestidorDTO(newObj));	
	}
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);	
		return ResponseEntity.noContent().build();
	}
}