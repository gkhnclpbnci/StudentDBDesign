package com.gkhnclpbnci.studentdbdesign;

/**
 * Created by ALTAY on 6.5.2017.
 */

public class Student {
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private String gender;
    private Double gpa;
    private Integer clas;

    public Student(){

    }
    public Student(String name, String surname, Integer age, String gender, Double gpa, Integer clas) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
        this.clas = clas;
    }

    public Student(Long id, String name, String surname, Integer age, String gender, Double gpa, Integer clas) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
        this.clas = clas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Integer getClas() {
        return clas;
    }

    public void setClas(Integer clas) {
        this.clas = clas;
    }
}
