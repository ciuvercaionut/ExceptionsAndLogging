package com.exceptionsandlogging.siit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        StudentRepository d = new StudentRepository();

    d.addStudent("a", "", LocalDate.parse("1989-12-31"), "mi", "123");

    }
}
