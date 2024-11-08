package com.example.SpringbootLayers.service;

import com.example.SpringbootLayers.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> list = new ArrayList<>(List.of(
      new Student(1,"aathan","ai"),
      new Student(2,"saif","blockchain"),
      new Student(29,"balaji","java")
    ));

    public List<Student> getStudents() {
        return list;
    }

    public Student getStudentById(int id){
        for (Student student : list) {
            if (student.getRno() == id) {
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    public void updateStudent(Student student) {
        int index = 0;
        for(int i=0;i<list.size();i++){
            if(student.getRno()==list.get(i).getRno()){
                index = i;break;
            }
        }
        list.set(index,student);
    }

    public void deleteStudentById(int id) {
        int index = 0;
        for(int i=0;i<list.size();i++){
            if(id==list.get(i).getRno()){
                index = i;break;
            }
        }
        list.remove(index);
    }
}
