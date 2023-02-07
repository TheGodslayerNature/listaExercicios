package lista5_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStudent {
    Student student = new Student();
    @Test
    public void testNameStudent(){
        student.setName("Jarvis");
        assertEquals("Jarvis", student.getName());
    }
    @Test
    public void testGrade(){
        student.setFirstGrade(27.00);
        assertEquals(27.00, student.getFirstGrade(), 0.05);

        student.setSecondGrade(31.00);
        assertEquals(31.00, student.getSecondGrade(), 0.05);

        student.setThirdGrade(32.00);
        assertEquals(32.00, student.getThirdGrade(), 0.05);
    }
    @Test
    public void testPass(){
        student.setFirstGrade(27.00);
        assertEquals(27.00, student.getFirstGrade(), 0.05);

        student.setSecondGrade(31.00);
        assertEquals(31.00, student.getSecondGrade(), 0.05);

        student.setThirdGrade(32.00);
        assertEquals(32.00, student.getThirdGrade(), 0.05);

        assertEquals(90.00, student.finalGrade(),0.05);
        assertEquals("PASS", student.pointsMissing());
    }
    @Test
    public void testGradeFail(){
        student.setFirstGrade(17.00);
        assertEquals(17.00, student.getFirstGrade(), 0.05);

        student.setSecondGrade(20.00);
        assertEquals(20.00, student.getSecondGrade(), 0.05);

        student.setThirdGrade(15.00);
        assertEquals(15.00, student.getThirdGrade(), 0.05);

        assertEquals(52.00, student.finalGrade(),0.05);
        assertEquals("FAILED\nMISSING 8.00", student.pointsMissing());
    }

}
