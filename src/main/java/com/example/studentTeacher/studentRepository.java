package com.example.studentTeacher;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class studentRepository {

    private Map<Integer, student> studentDb = new HashMap<>();

   private  Map<String, teacher> teacherDb = new HashMap<>();

   private Map<String, List<String>> teacherStudentDb =new HashMap<>();

    public studentRepository(Map<Integer, student> studentDb, Map<String, teacher> teacherDb) {
        this.studentDb = studentDb;
        this.teacherDb = teacherDb;
        this.teacherStudentDb = teacherStudentDb;
    }

    // add student
    public  void addStudent (student s){
        int admNo = s.getAdmNo();
        studentDb.put(admNo, s);
    }


    // add teacher
    public void addTeacher(teacher t){
        String name = t.getNameofTeacher();
        teacherDb.put(name, t);
    }



    // add student teacher pair
    public void addStudentTeacherPair(String student, String teacher){
        List<String> students = new ArrayList<>();
        if (studentDb.containsKey(student) && teacherDb.containsKey(teacher)){

            if (teacherStudentDb.containsKey(teacher)){
                students = teacherStudentDb.get(teacher);
            }
            students.add(student);
        }
        teacherStudentDb.put(teacher, students);
    }


    // get student
    public student getStudent(Integer admNo){
        return studentDb.get(admNo);
    }



    // get List of Students
    public List<String > getStudents(String teacherName){
        List<String> listOfStudents = new ArrayList<>();
        if (teacherStudentDb.containsKey(teacherName)){
            listOfStudents = teacherStudentDb.get(teacherName);
        }
        return listOfStudents;
    }

    //getTeacher
    public String getTeacher(student s1, student s2){
        if (s1.getAllocatedTeacher().equals(s2.getAllocatedTeacher())){
            return s1.getAllocatedTeacher();
        }
        else{
            return "Not Match";
        }
    }


}
