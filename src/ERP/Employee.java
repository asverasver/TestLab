package ERP;

public class Employee {

    private String name;
    private int employeeId;
    private int salary;

    public Employee(int id, String name, int sal) {
        this.employeeId = id;
        this.name = name;
        this.salary = sal;
    }

    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        boolean status = false;
        if(this.name.equalsIgnoreCase(employee.name)
                && this.salary == employee.salary) {
            status = true;
        }
        return status;
    }

    public static String getEmpNameWithHighestSalary() {
        /**
         * logic to get Highest paid employee
         */
        return "Joseph";
    }

    public static Employee getHighestPaidEmployee() {
        /**
         * hiding logic to get highest paid employee
         */
        return new Employee(1, "Joseph", 150000);
    }

    public int hashCode() {
        return this.employeeId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String employeeInfo = String.format("Employee name: %s\nId: %d\nSalary: %d",
                this.name, this.employeeId, this.salary);
        return employeeInfo;
    }
}