package com.absolucoes.primaterra.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.absolucoes.primaterra.domain.Terreneiro;
import com.absolucoes.primaterra.service.TerreneiroService;

@RestController
@RequestMapping(value="/terreneiro")
public class TerreneiroResource {

	@Autowired
	private TerreneiroService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Terreneiro> findByID(@PathVariable Integer terreneiro_id){
		Terreneiro obj = service.findById(terreneiro_id);
		return ResponseEntity.ok().body(obj);
	}
}
