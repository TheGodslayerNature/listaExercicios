package lista5_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFuncionario {
    @Test
    public void testFuncionario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setName("João Silva");
        funcionario.setGrossSalary(6000);
        assertEquals("João Silva", funcionario.getNomeFuncionario());
        assertEquals(5000.00, funcionario.getSalary(),0.05);
        funcionario.increseSalary(10.00);
        assertEquals(5600.00, funcionario.getSalary(),0.05);
    }
}
