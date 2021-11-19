package com.example.studentrecordapp.repository;

import com.example.studentrecordapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {
}
