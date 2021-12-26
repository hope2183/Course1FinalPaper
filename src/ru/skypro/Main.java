package ru.skypro;

public class Main {

    private static final Employee[]employees = new Employee[10];

    public static boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
           }
       }
        return false;
    }
    public static void printEmployees(){
        for (Employee employee:employees
        ) {
            if(employee !=null){
                System.out.println(employee);
            }
        }}
    public static void printEmployeesNamesOnly(){
        for (Employee employee:employees
        ) {
            if(employee !=null){
                System.out.println(employee.getFullName());
            }
        }}

    private static float calculateTotalSalary() {
        float sum = 0;
        for (Employee employee:employees
        ) {
            if(employee!=null){
                sum += employee.getSalaryMonth();
            }
        }
        return sum;

    }
    public static Employee findEmployeeWithMinSalary(){
        Employee result = null;
        float minSalary = Float.MAX_VALUE;
        for (Employee employee: employees
        ) {
            if(employee !=null && employee.getSalaryMonth()<minSalary){
                minSalary = employee.getSalaryMonth();
                result = employee;
            }
        }
        return result;
    }
    public static Employee findEmployeeWithMaxSalary(){
        Employee result = null;
        float maxSalary = Float.MIN_VALUE;
        for (Employee employee: employees
        ) {
            if(employee !=null && employee.getSalaryMonth()>maxSalary){
                maxSalary = employee.getSalaryMonth();
                result = employee;
            }
        }
        return result;
    }
    public static float calculateAverageSalary() {
        int employeeCount = 0;
        for (Employee employee:employees
             ) {
          if(employee!=null){
              employeeCount++;
          }
        }
        return calculateTotalSalary() / employeeCount;
    }

    public static void main(String[] args) {
        addEmployee(new Employee("Иванов", "Иван", "Иванович", 1, 70000));
        addEmployee(new Employee("Воробьев", "Петр", "Петрович", 1, 85000));
        addEmployee(new Employee("Сидорова", "Айгуль", "Сергеевна", 1, 120000));
        addEmployee(new Employee("Ким", "Наталья", "Андреевна", 2, 150000));
        addEmployee(new Employee("Бобров", "Андрей", "Степанович", 2, 170000));
        addEmployee(new Employee("Петров", "Николай", "Денисович", 3, 75000));
        addEmployee(new Employee("Скворцова", "Анжелика", "Петровна", 4, 95000));
        addEmployee(new Employee("Пак", "Сергей", "Валентинович", 4, 95000));
        addEmployee(new Employee("Директор", "Вячеслав", "Степанович", 5, 250000));
        printEmployees();
        System.out.println("Затраты на ЗП в месяц: "+calculateTotalSalary());
        System.out.println("Сотружник с минимальной зп: "+findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зп: "+findEmployeeWithMaxSalary());
        System.out.println("Средняя зп в месяц: "+calculateAverageSalary());
        printEmployeesNamesOnly();

    }
}