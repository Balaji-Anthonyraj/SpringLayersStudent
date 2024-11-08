package com.example.SpringbootLayers.service;

import com.example.SpringbootLayers.model.Student;
import com.example.SpringbootLayers.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public List<Student> getStudents() {
        return repo.findAll();
    }

    public Student getStudentById(int id){
       return repo.findById(id).orElse(new Student());
    }

    public void addStudent(Student student) {
        repo.save(student);
    }

    public void updateStudent(Student student) {
       repo.save(student);
    }

    public void deleteStudentById(int id) {
       repo.deleteById(id);
    }
}
