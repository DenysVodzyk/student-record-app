package com.example.studentrecordapp.service;

import com.example.studentrecordapp.entity.Student;

import java.util.List;

public interface IStudentService {

    List<Student> getAllStudents();

    void addStudent(Student student);

    void deleteStudent(Long studentId);
}