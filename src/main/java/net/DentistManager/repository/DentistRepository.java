package net.DentistManager.repository;

import org.springframework.data.repository.CrudRepository;

import net.DentistManager.entity.Dentist;

public interface DentistRepository extends CrudRepository<Dentist, Integer> {
	// Auto-implemented by Spring Boot
}