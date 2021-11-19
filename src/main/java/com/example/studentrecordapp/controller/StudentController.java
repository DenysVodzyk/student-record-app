package com.example.studentrecordapp.controller;

import com.example.studentrecordapp.entity.Student;
import com.example.studentrecordapp.service.IStudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/")
@AllArgsConstructor
public class StudentController {
    private final IStudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


}
