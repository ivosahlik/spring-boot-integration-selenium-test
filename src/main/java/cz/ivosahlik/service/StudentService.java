package cz.ivosahlik.service;

import java.util.List;
import java.util.Optional;

import cz.ivosahlik.model.Student;


public interface StudentService {
	 List<Student> findAll();
	 Student save(Student student);
	 Optional<Student>  findOne(Long id);
	 void delete(Long id);
}
