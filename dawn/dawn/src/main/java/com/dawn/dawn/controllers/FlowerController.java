package com.dawn.dawn.controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.dawn.dawn.model.Flower;
import com.dawn.dawn.repository.FlowerRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class FlowerController {
	private FlowerRepository repository;
	
	@PostMapping()
	public ResponseEntity<Flower> create(@Valid @RequestBody Flower createRequest) {
		return ResponseEntity.ok(repository.save(createRequest));
	}
	
	@GetMapping()
	List<Flower> all() {
		return repository.findAll();
	}
}