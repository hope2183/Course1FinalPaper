package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Employee ivanov = new Employee("Иванов", "Иван", "Иванович", 1, 70000);
       System.out.println(ivanov);
        //ivanov.setSalaryMonth(69000);
        // ivanov.setDepartment(2);
       //System.out.println(ivanov.getSalaryMonth());
        Employee vorobiev = new Employee("Воробьев", "Петр", "Петрович", 1, 85000);
        System.out.println(vorobiev);


    }
}