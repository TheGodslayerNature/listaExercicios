package secao13;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepartmentTest {
    @Test
    public void testDepartmentName(){
        Department department = new Department("Design");
        assertEquals("Design", department.getName());
    }
}
