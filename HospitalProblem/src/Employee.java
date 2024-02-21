public class Employee extends Person {
    private Integer employeeID;

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    protected Employee(String fullName, Integer employeeID) {
        super(fullName);
        this.employeeID = employeeID;
    }
}
