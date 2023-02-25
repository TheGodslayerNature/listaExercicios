package lista7_exercicios;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPessoa {
    @Test
    public void testPessoa(){
        Pessoa pessoa = new Pessoa("Joao",15,1.82);
        assertEquals("Joao",pessoa.getName());
        assertEquals(15,pessoa.getAge());
        assertEquals(1.82,pessoa.getHeight(),0.005);
    }
    @Test
    public void testPessoaIsLegalAge(){
        Pessoa pessoa = new Pessoa("Joao",15,1.82);
        Pessoa pessoa1 = new Pessoa("Maria",14,1.82);
        Pessoa pessoa2 = new Pessoa("Joao",20,1.82);
        Pessoa pessoa3 = new Pessoa("Joao",23,1.82);
        Pessoa[] pessoas = {pessoa, pessoa1,pessoa2, pessoa3};
        assertFalse(pessoa.isLegalAge());
        assertEquals(50.0, PessoaProgram.percent(pessoas),0.05);
    }
    @Test
    public void testAverageHeight(){
        Pessoa joao = new Pessoa("Joao", 15, 1.82);
        Pessoa maria = new Pessoa("Maria", 16, 1.60);
        Pessoa teresa = new Pessoa("Teresa", 14, 1.58);
        Pessoa carlos = new Pessoa("Carlos", 21, 1.65);
        Pessoa paulo = new Pessoa("paulo", 17,1.78);
        Pessoa[] peoples = {joao,maria,teresa,carlos,paulo};
        assertEquals(1.69, PessoaProgram.averageHeight(peoples),0.05);
    }
}
