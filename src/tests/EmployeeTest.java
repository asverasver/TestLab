package tests;

import ERP.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class EmployeeTest {

    Employee testEmployee1 = new Employee(1, "Joseph", 150000);

    @Test
    public void testGetHighestPaidEmployee() {
        assertEquals(testEmployee1, Employee.getHighestPaidEmployee());
    }

    @Test
    public void testEmployeeEquals() {
        Employee testEmployee2 = new Employee(2, "Joseph", 150000);
        assertFalse(testEmployee2.equals(testEmployee1));
    }

    @Test
    public void testEmployeeEqualsNull() {
        Employee testEmployee2 = null;
        assertFalse(testEmployee1.equals(testEmployee2));
    }

}