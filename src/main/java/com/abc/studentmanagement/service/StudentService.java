package com.abc.studentmanagement.service;

import com.abc.studentmanagement.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String addStudent(Student student){
        try{
            System.out.println(student.toString());
            return "Student added successfully.";
        }catch (Exception e){
            throw e;
        }
    }
}

