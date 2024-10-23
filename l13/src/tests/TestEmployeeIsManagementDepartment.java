package src.tests;

import src.Employee;
import src.TestEmployeeForTrait;

public class TestEmployeeIsManagementDepartment implements TestEmployeeForTrait {
    @Override
    public boolean test(Employee e) {
        return e.getDepartment().equals("Management");
    }
}