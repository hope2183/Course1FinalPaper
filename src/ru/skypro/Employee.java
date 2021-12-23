package ru.skypro;

import java.util.StringJoiner;

public class Employee<employees> {
    private final String firstName;
    private final String fatherName;
    private final String lastName;
    private int department;
    private int salaryMonth;

    public Employee(String lastName, String firstName, String fatherName, int department, int salaryMonth) {
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.lastName = lastName;
        this.department = department;
        this.salaryMonth = salaryMonth;

    }

    public int getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(int salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFatherName() {
        return this.fatherName; }

    public String getFullName() {
        return this.lastName+firstName+fatherName;
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

    @Override
    public String toString() {
        return "СОТРУДНИК: " + lastName + " " + firstName + " " + fatherName +
                " ОТДЕЛ: " + department + " ЗАРАБОТНАЯ ПЛАТА, руб.: " + salaryMonth;
    }

}

