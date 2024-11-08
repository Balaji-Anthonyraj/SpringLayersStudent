package com.example.SpringbootLayers.controller;

import com.example.SpringbootLayers.model.Student;
import com.example.SpringbootLayers.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return service.getStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @PutMapping("/students")
    public void updateStudent(@RequestBody Student student) {
        service.updateStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable int id){
        service.deleteStudentById(id);
    }
}
