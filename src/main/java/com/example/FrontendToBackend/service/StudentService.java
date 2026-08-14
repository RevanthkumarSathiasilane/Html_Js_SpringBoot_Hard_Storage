package com.example.FrontendToBackend.service;

import com.example.FrontendToBackend.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> list = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Revanth","Java"),
                    new Student(2,"Praveen","AI"),
                    new Student(3,"Akash","IoT")
            )
    );
    public List<Student> getAllStudents(){
        return list;
    }

    public void addStudents(int rno,String name,String technology) {
        Student student = new Student(rno,name,technology);
        list.add(student);
    }
}
