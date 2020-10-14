package com.dawn.dawn.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dawn.dawn.security.model.ERole;
import com.dawn.dawn.security.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
	Optional<Role>findByName(ERole name);
}
