package src;

public class Employee {

    private String name;
    private String department;
    private boolean canConductInterview;
    private boolean canAttendTraining;

    public Employee(String name, String department, boolean canConductInterview, boolean canAttendTraining) {
        this.name = name;
        this.department = department;
        this.canConductInterview = canConductInterview;
        this.canAttendTraining = canAttendTraining;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public boolean canConductInterview() {
        return canConductInterview;
    }

    public boolean canAttendTraining() {
        return canAttendTraining;
    }

    @Override
    public String toString() {
        return String.format("Employee[name=%s, department=%s, canConductInterview=%s, canAttendTraining=%s]",
                name, department, canConductInterview, canAttendTraining);
    }
}