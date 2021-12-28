package ru.skypro;

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int quantityOfPeople) {
        employees = new Employee[quantityOfPeople];
    }

    public void printEmployees() {
        for (Employee employee :
                employees) {
            System.out.println(employee);
        }
    }

    public boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public void printEmployeesNamesOnly() {
        for (Employee employee : employees
        ) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    private float calculateTotalSalary() {
        float sum = 0;
        for (Employee employee : employees
        ) {
            if (employee != null) {
                sum += employee.getSalaryMonth();
            }
        }
        return sum;

    }

    public Employee findEmployeeWithMinSalary() {
        Employee result = null;
        float minSalary = Float.MAX_VALUE;
        for (Employee employee : employees
        ) {
            if (employee != null && employee.getSalaryMonth() < minSalary) {
                minSalary = employee.getSalaryMonth();
                result = employee;
            }
        }
        return result;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee result = null;
        float maxSalary = Float.MIN_VALUE;
        for (Employee employee : employees
        ) {
            if (employee != null && employee.getSalaryMonth() > maxSalary) {
                maxSalary = employee.getSalaryMonth();
                result = employee;
            }
        }
        return result;
    }

    public float calculateAverageSalary() {
        int employeeCount = 0;
        for (Employee employee : employees
        ) {
            if (employee != null) {
                employeeCount++;
            }
        }
        return calculateTotalSalary() / employeeCount;
    }

    public void printEmployeesByDepartment(int department) {
        for (Employee employee : employees
        ) {
            if (employee != null && employee.getDepartment() == department) {

                System.out.println(employee.getId() + ". Сотрудник: " + employee.getFullName() + ", заработная плата: " + employee.getSalaryMonth());
            }
        }
    }

    private float calculateTotalSalaryInDepartment(int department) {
        float sumInDepartment = 0;
        for (Employee employee : employees
        ) {
            if (employee != null && employee.getDepartment() == department) {

                sumInDepartment += employee.getSalaryMonth();
            }
        }
        return sumInDepartment;

    }

    public Employee findEmployeeWithMinSalaryInDepartment(int department) {

        float minSalary = Float.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() != department) {
                    continue;
                }
                if (employee.getSalaryMonth() < minSalary) {
                    minSalary = employee.getSalaryMonth();
                    result = employee;
                }
            }
        }
        return result;
    }

    public Employee findEmployeeWithMaxSalaryInDepartment(int department) {
        Employee result = null;
        float maxSalary = Float.MIN_VALUE;
        for (Employee employee : employees
        ) {
            if (employee != null) {
                if (employee.getDepartment() != department) {
                    continue;
                }
                if (employee.getSalaryMonth() > maxSalary) {
                    maxSalary = employee.getSalaryMonth();
                    result = employee;
                }
            }
        }
        return result;
    }

    public float calculateAverageSalaryInDepartment(int department) {
        int employeeCount = 0;
        float sum = 0;
        for (Employee employee : employees
        ) {
            if (employee != null && employee.getDepartment() == department) {
                employeeCount++;
                sum += employee.getSalaryMonth();
            }
        }
        return sum / employeeCount;
    }

    public void salaryIncreaseInDepartment(int department, float percentOfIncrease) {
        for (Employee employee : employees
        ) {
            if (employee != null && employee.getDepartment() == department) {
                float currentSalary = employee.getSalaryMonth();
                employee.setSalaryMonth(currentSalary * (percentOfIncrease / 100 + 1));

            }
        }
    }

    public void printEmployeesByDepWithSalaryLessNumber(int department, int number) {
        for (Employee employee : employees
        ) {
            if (employee != null && employee.getDepartment() == department && employee.getSalaryMonth() < number) {

                System.out.println(employee.getId() + ". Сотрудник: " + employee.getFullName() + ", заработная плата: " + employee.getSalaryMonth());
            }
        }
    }

    public void printEmployeesByDepWithSalaryMoreNumber(int department, int number) {
        for (Employee employee : employees
        ) {
            if (employee != null && employee.getDepartment() == department && employee.getSalaryMonth() >= number) {

                System.out.println(employee.getId() + ". Сотрудник: " + employee.getFullName() + ", заработная плата: " + employee.getSalaryMonth());
            }
        }
    }

    public void removeEmployee(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
            }
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public void changeEmployeeSalary(String fullName, float salary) {
        for (Employee employee : employees
        ) {
            if (employee != null && employee.getFullName().equals(fullName)) {
                employee.setSalaryMonth(salary);
                System.out.println(employee);
            }
        }
    }
    public void changeEmployeeDepartment(String fullName, int department) {
        for (Employee employee : employees
        ) {
            if (employee != null && employee.getFullName().equals(fullName)) {
                employee.setDepartment(department);
                System.out.println(employee);
            }
        }
    }

    public void printDepartment(int department){
        for (Employee employee : employees
        ) {
            if (employee != null && employee.getDepartment()==department) {

                System.out.println(employee.getId()+" "+employee.getFullName());
            }
    }
}

}
