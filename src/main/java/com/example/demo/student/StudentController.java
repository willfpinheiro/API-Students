package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//Todos os recursos para a api
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;
//utilizar injection no construtor do student
    @Autowired
    public StudentController(StudentService studentService) {
//        this.studentService = new StudentService(); forma noirmal de se fazer sem injection
        this.studentService = studentService;
    }

    //	Rest endpoins
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
