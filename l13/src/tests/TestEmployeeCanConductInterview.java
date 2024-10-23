package src.tests;

import src.Employee;
import src.TestEmployeeForTrait;

public class TestEmployeeCanConductInterview implements TestEmployeeForTrait {

    @Override
    public boolean test(Employee e) {
        return e.canConductInterview();
    }
}
