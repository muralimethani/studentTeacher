package com.example.studentTeacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.ArrayList;

@RestController

public class studentController {

    @Autowired
    studentService studentService;

    // add student
    @PostMapping("/add-student")
    public ResponseEntity<String> addStudent(student s){
        studentService.addStudent(s);
        return new ResponseEntity<>("student added successfully", HttpStatus.CREATED);
    }

    // add Teacher
    @PostMapping("/add-teacher")
    public ResponseEntity<String> addTeacher(teacher t){
        studentService.addTeacher(t);
        return new ResponseEntity<>("teacher added successfully", HttpStatus.CREATED);
    }

    //Add student teacher pair
    @PostMapping("/add-studentTeacher-pair")
    public ResponseEntity<String> addStudentTeacherPair(String student, String teacher){
        studentService.addStudentTeacherPair(student, teacher);
        return new ResponseEntity<>("Student Teacher Pair added Successfully", HttpStatus.CREATED);
    }

    // get student
    @GetMapping("/get-student")
    public ResponseEntity<student> getStudent(Integer admNo){
        student s = studentService.getStudent(admNo);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    //get students list
    @GetMapping("/get-studentsList")
    public ResponseEntity<List<String>> getStudentsList( String teacherName){
        List <String> studentsList = new ArrayList<>();
        return new ResponseEntity<>(studentsList, HttpStatus.OK);
    }


    // get teacher

    @GetMapping("/checkTeacherSameOrNot")
    public ResponseEntity<String > getTeacher(student s1, student s2){
        String ans = studentService.getTeacher(s1, s2);
        return new ResponseEntity<>(ans, HttpStatus.OK);
    }

}
