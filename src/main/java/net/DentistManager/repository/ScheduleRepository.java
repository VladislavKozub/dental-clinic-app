package net.DentistManager.repository;

import java.util.List;

import net.DentistManager.entity.Patient;
import org.springframework.data.repository.CrudRepository;

import net.DentistManager.entity.Schedule;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
	public List<Schedule> findAllByPatient(Patient patient);
	public List<Schedule> findAllByOrderByDateAscTimeAsc();
}