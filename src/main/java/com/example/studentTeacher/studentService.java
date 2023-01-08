package com.example.studentTeacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {

    @Autowired
    studentRepository studentRepository;
    //add student
    public  void addStudent(student s){
        studentRepository.addStudent(s);
    }

    public void addTeacher(teacher t){
        studentRepository.addTeacher(t);
    }

    public void addStudentTeacherPair(String student, String teacher){
        studentRepository.addStudentTeacherPair(student, teacher);
    }


    // get student
    public  student getStudent(Integer admNo){
        return studentRepository.getStudent(admNo);
    }

    // get List of Students

    public List<String> getListOfStudents(String teacherName){
        return studentRepository.getStudents(teacherName);
    }

    //get teacher

    public String getTeacher(student s1, student s2){
        return studentRepository.getTeacher(s1, s2);
    }
}
