package net.javaguide.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguide.sms.entity.Student;
import net.javaguide.sms.repository.StudentRepository;
import net.javaguide.sms.service.StudentService;


@Service
public class StudentServiceIMPL implements StudentService {

	
	
	private StudentRepository studentRepository;
	
		public StudentServiceIMPL(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}





	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}





	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}





	@Override
	public Student getStudentById(Long id) {
				return studentRepository.findById(id).get();
	}





	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
		
	}





	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
		
	}





	

}
