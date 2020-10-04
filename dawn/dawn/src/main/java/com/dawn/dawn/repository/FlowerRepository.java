package com.dawn.dawn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dawn.dawn.model.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Long> {

}