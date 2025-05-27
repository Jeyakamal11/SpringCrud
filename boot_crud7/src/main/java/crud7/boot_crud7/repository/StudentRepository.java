package crud7.boot_crud7.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import crud7.boot_crud7.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	List<Student> findByNameLike(String string);

	List<Student> findByMobile(long num);
	
	List<Student> findByEmailLike(String search);

}
