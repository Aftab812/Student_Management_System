package com.example.demo.controller;
import com.example.demo.model.Student;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;

@RestController // this can handle rest api like get post etc
@RequestMapping("/students")// this is the base url for all the api in this controller
@CrossOrigin(origins = "http://localhost:5173/") // this is to allow cross origin requests from the frontend
public class StudentController{

    @GetMapping
    public ArrayList<Student> getStudent(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Mohd Aftab", "CSE"));
        students.add(new Student(2, "Vansh Sharma", "CSE"));
        students.add(new Student(3, "Jhatoo Jatin", "CSE"));
        return students;
    }
}
