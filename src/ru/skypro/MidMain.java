package ru.skypro;

public class MidMain {
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

    public static void printEmployeesByDepartment(int department){
        for (Employee employee:employees
        ) {
            if(employee !=null && employee.getDepartment()==department){

                System.out.println(employee.getId()+". Сотрудник: "+employee.getFullName()+", заработная плата: "+employee.getSalaryMonth());
        }}}

    private static float calculateTotalSalaryInDepartment(int department) {
        float sumInDepartment = 0;
        for (Employee employee:employees
        ) {
            if(employee!=null && employee.getDepartment()==department){

                sumInDepartment += employee.getSalaryMonth();
            }
        }
        return sumInDepartment;

    }
    public static Employee findEmployeeWithMinSalaryInDepartment(int department){

        float minSalary = Float.MAX_VALUE;
        Employee result = null;
        for (Employee employee: employees) {
            if(employee !=null){
                if (employee.getDepartment()!=department){
                    continue;
                }
                if(employee.getSalaryMonth()<minSalary){
                minSalary = employee.getSalaryMonth();
                result = employee;
            }
        }}
        return result;
    }
    public static Employee findEmployeeWithMaxSalaryInDepartment(int department){
        Employee result = null;
        float maxSalary = Float.MIN_VALUE;
        for (Employee employee: employees
        ) {
            if(employee !=null){
                if (employee.getDepartment()!=department){
                    continue;
                }
             if (employee.getSalaryMonth()>maxSalary){
                maxSalary = employee.getSalaryMonth();
                result = employee;
            }
        }}
        return result;
    }
    public static float calculateAverageSalaryInDepartment(int department) {
        int employeeCount = 0;
        float sum =0;
        for (Employee employee:employees
        ) {
            if(employee!=null && employee.getDepartment()==department){
                employeeCount++;
                sum+=employee.getSalaryMonth();
            }
        }
        return sum / employeeCount;
    }
public static void salaryIncreaseInDepartment (int department, float percentOfIncrease){
    for (Employee employee:employees
    ) {
        if(employee!=null && employee.getDepartment()==department){
            float currentSalary = employee.getSalaryMonth();
            employee.setSalaryMonth(currentSalary*(percentOfIncrease/100+1));
        }
}}
    public static void main(String[] args) {
        System.out.println();
        int department = 1;
        addEmployee(new Employee("Иванов", "Иван", "Иванович", 1, 70000));
        addEmployee(new Employee("Воробьев", "Петр", "Петрович", 1, 85000));
        addEmployee(new Employee("Сидорова", "Айгуль", "Сергеевна", 1, 120000));
        addEmployee(new Employee("Ким", "Наталья", "Андреевна", 2, 150000));
        addEmployee(new Employee("Бобров", "Андрей", "Степанович", 2, 170000));
        addEmployee(new Employee("Петров", "Николай", "Денисович", 3, 75000));
        addEmployee(new Employee("Скворцова", "Анжелика", "Петровна", 4, 95000));
        addEmployee(new Employee("Пак", "Сергей", "Валентинович", 4, 95000));
        addEmployee(new Employee("Директор", "Вячеслав", "Степанович", 5, 250000));

        printEmployeesByDepartment(department);
        System.out.println("Затраты отдела на ЗП в месяц: "+calculateTotalSalaryInDepartment(department));
        System.out.println("Сотрудник с минимальной зп в отделе: "+findEmployeeWithMinSalaryInDepartment(department));
        System.out.println("Сотрудник с максимальной зп в отделе: "+findEmployeeWithMaxSalaryInDepartment(department));
        System.out.println("Средняя зп в месяц по отделу: "+calculateAverageSalaryInDepartment(department));

        salaryIncreaseInDepartment(5, 25);
        printEmployeesByDepartment(5);

    }
}

