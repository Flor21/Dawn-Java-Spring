package com.dawn.dawn.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.dawn.dawn.model.Flower;
import com.dawn.dawn.repository.FlowerRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RestController
public class FlowerController {
	@Autowired
	private FlowerRepository repository;
	
	 // FlowerController(FlowerRepository repository) {
		//    this.repository = repository;
		  //}

	@PostMapping(path="/addFlower")
	public ResponseEntity<Flower> create(@Valid @RequestBody Flower createRequest) {
		System.out.println(this.repository);
		@Valid
		Flower x = this.repository.save(createRequest);
		return ResponseEntity.ok(x);
	}
	
	@GetMapping(path="/flowers")
	public Page<Flower> getPage(Pageable pageable) {
		return repository.findAll(pageable);
	}
}