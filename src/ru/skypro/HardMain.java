package ru.skypro;

public class HardMain {
    public static void main(String[] args) {
    EmployeeBook employeeBook = new EmployeeBook(10);
    employeeBook.addEmployee(new Employee("Иванов", "Иван", "Иванович", 1, 70000));
    employeeBook.addEmployee(new Employee("Воробьев", "Петр", "Петрович", 1, 85000));
    employeeBook.addEmployee(new Employee("Сидорова", "Айгуль", "Сергеевна", 1, 120000));
    employeeBook.addEmployee(new Employee("Ким", "Наталья", "Андреевна", 2, 150000));
    employeeBook.addEmployee(new Employee("Бобров", "Андрей", "Степанович", 2, 170000));
    employeeBook.addEmployee(new Employee("Петров", "Николай", "Денисович", 3, 75000));
    employeeBook.addEmployee(new Employee("Скворцова", "Анжелика", "Петровна", 4, 95000));
    employeeBook.addEmployee(new Employee("Пак", "Сергей", "Валентинович", 4, 95000));
    employeeBook.addEmployee(new Employee("Директор", "Вячеслав", "Степанович", 5, 250000));
    int department = 1;

    employeeBook.printEmployees();
    employeeBook.removeEmployee("Скворцова Анжелика Петровна");
    employeeBook.printEmployees();
    employeeBook.changeEmployeeSalary("Директор Вячеслав Степанович", 350000);
    employeeBook.changeEmployeeDepartment("Пак Сергей Валентинович", 5);
    System.out.println("ОТДЕЛ "+department+" ");
    employeeBook.printDepartment(department);
}}
