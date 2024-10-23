package src;

import java.util.ArrayList;
import java.util.List;

import src.tests.TestEmployeeCanAttendTraining;
import src.tests.TestEmployeeCanConductInterview;
import src.tests.TestEmployeeIsManagementDepartment;
import src.tests.TestEmployeeIsSoftwareDepartment;

class EmployeeStatistics {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Management", true, true));
        employees.add(new Employee("Mike", "Management", true, true));
        employees.add(new Employee("Hector", "Software", false, true));
        employees.add(new Employee("Bob", "Software", true, false));
        printStatistics(employees, new TestEmployeeCanAttendTraining());
        printStatistics(employees, (Employee e) -> e.getDepartment().equals("Software"));
        printStatistics(employees, new TestEmployeeCanConductInterview());
        printStatistics(employees, new TestEmployeeIsManagementDepartment());
        printStatistics(employees, new TestEmployeeIsSoftwareDepartment());
    }

    private static void printStatistics(List<Employee> employees, TestEmployeeForTrait traitTester) {
        for (Employee employee : employees) {
            if (traitTester.test(employee)) {
                System.out.println(employee);
            }
        }
        System.out.println();
    }
}