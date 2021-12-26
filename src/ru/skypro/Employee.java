package ru.skypro;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class Employee {
    private static int counter = 1;
    private int id;

    private final String firstName;
    private final String fatherName;
    private final String lastName;
    private int department;
    private float salaryMonth;


    public Employee(String lastName, String firstName, String fatherName, int department, float salaryMonth) {

        this.firstName = firstName;
        this.fatherName = fatherName;
        this.lastName = lastName;
        this.department = department;
        this.salaryMonth = salaryMonth;
        this.id = counter++;
    }

    public float getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(float salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFatherName() {
        return this.fatherName;
    }

    public String getFullName() {

        return this.lastName +" "+ firstName+" " + fatherName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public int getDepartment() {

        return this.department;
    }

    public void setDepartment(int department) {

        this.department = department;
    }

    public int getId() {
        this.id = id;
        return id;
    }




    @Override
    public String toString() {
        return "ID: "+id+" СОТРУДНИК: " + lastName + " " + firstName + " " + fatherName +
                " ОТДЕЛ: " + department + " ЗАРАБОТНАЯ ПЛАТА, руб.: " + salaryMonth;
    }

}