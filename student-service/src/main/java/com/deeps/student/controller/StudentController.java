package com.deeps.student.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.deeps.student.entity.Student;
import com.deeps.student.service.StudentService;

@RestController
@RequestMapping("/students")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public Student saveStudent(@RequestBody Student student) {
        System.out.println("Inside saveStudent method of StudentController");
        return  studentService.saveStudent(student);
    }

    @GetMapping("/{id}")
    public Student findStudentById(@PathVariable("id") Long studentId) {
    	System.out.println("Inside findStudentById method of StudentController");
        return studentService.findStudentById(studentId);
    }

}
