package net.javaguide.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguide.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
