package cz.ivosahlik.service.impl;

import java.util.List;
import java.util.Optional;

import cz.ivosahlik.model.Student;
import cz.ivosahlik.repository.StudentRepository;
import cz.ivosahlik.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Optional<Student> findOne(Long id) {
		return studentRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
		studentRepository.deleteById(id);
	}

}
