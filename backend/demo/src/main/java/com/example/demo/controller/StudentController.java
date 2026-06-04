package com.example.demo.controller;

import com.example.demo.model.Student; 
import org.springframework.web.bind.annotation.*;

@RestController // this can handle rest api like get post etc
@RequestMapping("/students")// this is the base url for all the api in this controller
@CrossOrigin(origins = "http://localhost:5173/") // this is to allow cross origin requests from the frontend
public class StudentController{

    @GetMapping
    public Student getStudent(){
        return new Student(1,"Aftab","Computer Science");
    }
}
