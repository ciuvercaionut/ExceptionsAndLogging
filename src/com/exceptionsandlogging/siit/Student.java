package com.exceptionsandlogging.siit;

import sun.util.calendar.BaseCalendar;
import sun.util.calendar.CalendarDate;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String gender;
    private String cnp;

    public Student() {

    }


    public Student(String firstName, String lastName, LocalDate dob, String gender, String cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.cnp = cnp;


    }

    public int getAge(Student student) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(Period.between(getDob(),currentDate).getYears());
        return Period.between(getDob(), currentDate).getYears();

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getCnp() {
        return cnp;
    }

}