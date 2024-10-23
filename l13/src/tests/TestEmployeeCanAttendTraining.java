package src.tests;

import src.Employee;
import src.TestEmployeeForTrait;

public class TestEmployeeCanAttendTraining implements TestEmployeeForTrait {
    @Override
    public boolean test(Employee e) {
        return e.canAttendTraining();
    }
}