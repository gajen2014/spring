package net.javaguide.sms.service;

import java.util.List;

import net.javaguide.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudent();

	Student saveStudent(Student student);
	Student getStudentById(Long id);

	Student updateStudent(Student student);
	
	
	void deleteStudent(Long id);
	
}
