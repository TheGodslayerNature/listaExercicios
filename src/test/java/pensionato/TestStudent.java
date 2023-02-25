package pensionato;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStudent {
    @Test
    public void testStudentName(){
        Student student = new Student("Maicon", null);
        assertEquals("Maicon", student.getName());

        student.setName("Marcelo");
        assertEquals("Marcelo", student.getName());
    }
    @Test
    public void testStudentEmail(){
        Student student = new Student(null, "gg@gg.com");
        assertEquals("gg@gg.com", student.getEmail());

        student.setEmail("ff");
        assertEquals("ff", student.getEmail());
    }
}
