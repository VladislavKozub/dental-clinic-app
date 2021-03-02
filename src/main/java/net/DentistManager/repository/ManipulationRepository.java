package net.DentistManager.repository;

import org.springframework.data.repository.CrudRepository;

import net.DentistManager.entity.Manipulation;

public interface ManipulationRepository extends CrudRepository<Manipulation, Integer> {
	// Auto-implemented by Spring Boot
}