package org.todoManagement;

public class Employee extends Person{
    private String employeeID;

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String employeeID) {
        super(name, surname);
        this. employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                '}';
    }
}
