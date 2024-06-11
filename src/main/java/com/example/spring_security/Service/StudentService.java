package com.example.spring_security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.spring_security.Entity.Student;
import com.example.spring_security.Repository.StudentRepository;
@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;
    public void addStudent(Student st) {
        repo.save(st);
    }
}

