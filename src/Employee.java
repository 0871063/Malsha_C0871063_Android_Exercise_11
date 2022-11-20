public class Employee{

    protected String name;
    protected EmployeeType status;

    double salaryAccumulated;

    public Employee(String name, EmployeeType status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeType getStatus() {
        return status;
    }

    public void setStatus(EmployeeType status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Name : "  + name ;
    }
}
