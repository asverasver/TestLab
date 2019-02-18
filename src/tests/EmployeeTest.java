package tests;

import ERP.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee testEmployee1 = new Employee(1, "Joseph", 150000);

    @Test
    public void testGetHighestPaidEmployee() {
        assertEquals(testEmployee1, Employee.getHighestPaidEmployee());
    }

    @Test
    public void testEmployeeEquals() {
        Employee testEmployee2 = new Employee(2, "Joseph", 150000);
        assertTrue(testEmployee2.equals(testEmployee1));
    }

}