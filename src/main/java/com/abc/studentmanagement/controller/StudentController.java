package com.abc.studentmanagement.controller;

import com.abc.studentmanagement.model.Student;
import com.abc.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="firstProgram", method=RequestMethod.GET)
    public String firstProgram(){
        return "Run The Program";
    }
    @RequestMapping(value = "/addstudent", method = RequestMethod.POST)
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

}
