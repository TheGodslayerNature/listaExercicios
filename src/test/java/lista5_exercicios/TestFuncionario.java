package lista5_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFuncionario {
    @Test
    public void testFuncionario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setName("João Silva");
        funcionario.setGrossSalary(6000);
        assertEquals("João Silva", funcionario.name);
        assertEquals(6000.00, funcionario.grossSalary,0.05);
        assertEquals(5000.00, funcionario.getSalary(),0.05);
    }
}
