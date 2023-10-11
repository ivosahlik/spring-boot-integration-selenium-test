package cz.ivosahlik.repository;

import cz.ivosahlik.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("studentRepository")// refer by name
public interface StudentRepository extends JpaRepository<Student, Long> {
}
