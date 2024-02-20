public class Employee extends Person {
    protected String employeeID;
    protected Employee(String fullName, String employeeID) {
        super(fullName);
        this.employeeID = employeeID;
    }
}
