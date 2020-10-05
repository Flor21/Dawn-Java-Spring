package com.dawn.dawn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dawn.dawn.model.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {

}