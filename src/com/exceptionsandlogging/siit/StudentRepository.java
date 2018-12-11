package com.exceptionsandlogging.siit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentRepository extends  Student {

    private static Logger LOGGER = Logger.getLogger(StudentRepository.class.getName());

    public void addStudent(String firstName, String lastName, LocalDate dob, String gender, String cnp){
        Student student = new Student(firstName, lastName, dob, gender, cnp);
        try {

             validateDob(student);
         }catch (ValidationException e) {
            LOGGER.info(e.getMessage());
            LOGGER.log(Level.SEVERE,"Dob not in range.");
         }
         try {
             validateFirstAndLastName(student);
         }catch (ValidationException e){
             LOGGER.info(e.getMessage());
             LOGGER.log(Level.SEVERE,"First and Last name should not be empty.");
         }
         try {
             validateGender(student);
         }catch (ValidationException e){
             LOGGER.info(e.getMessage());
             LOGGER.log(Level.SEVERE,"This gender does not exist.");
         }
    }


   public void validateDob(Student student) throws ValidationException{
        if(student.getDob().isBefore(LocalDate.parse("1990-01-01")) || student.getDob().isAfter(LocalDate.now())){
            throw  new ValidationException("This Date of birth does not correspond.");
        }
   }

   public void validateFirstAndLastName(Student student) throws ValidationException{
        if(student.getFirstName().isEmpty() || student.getLastName().isEmpty()){
            throw  new ValidationException("First name and Last name should not be empty!");
       }
   }


   public void validateGender(Student student) throws  ValidationException{
        if(student.getGender().matches("male") || student.getGender().matches("female")
                || student.getGender().matches("M") || student.getGender().matches("F")
                || student.getGender().matches("m") || student.getGender().matches("f")){
            System.out.println("Everything is ok");
        }
        else{
            throw new ValidationException("Gender is not right");
        }
   }
}
