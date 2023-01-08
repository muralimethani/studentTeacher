package com.example.studentTeacher;

public class student {

    private  int admNo;
    private String name;
    private int standard;

    private String allocatedTeacher;

    public student(String allocatedTeacher) {
        this.allocatedTeacher = allocatedTeacher;
    }

    public student(int admNo, String name, int standard) {
        this.admNo = admNo;
        this.name = name;
        this.standard = standard;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getAllocatedTeacher() {
        return allocatedTeacher;
    }

    public void setAllocatedTeacher(String allocatedTeacher) {
        this.allocatedTeacher = allocatedTeacher;
    }
}
