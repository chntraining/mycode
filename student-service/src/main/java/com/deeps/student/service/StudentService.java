package com.deeps.student.service;

import com.deeps.student.entity.Student;
import com.deeps.student.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
    	System.out.println("Inside saveStudent of StudentService");
        return studentRepository.save(student);
    }

    public Student findStudentById(Long studentId) {
    	System.out.println("Inside saveStudent of StudentService");
        return studentRepository.findByStudentId(studentId);
    }
}
