package net.DentistManager.repository;

import net.DentistManager.entity.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
	// Auto-implemented by Spring Boot
}