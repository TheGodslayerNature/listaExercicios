package lista7_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMaisVelho {
    @Test
    public void testPessoaMaisVelha(){
        Pessoa maria = new Pessoa("Maria", 15);
        Pessoa joao = new Pessoa("João", 13);
        Pessoa ariane = new Pessoa("Ariane", 12);
        Pessoa[] pessoas = {ariane, maria, joao};
        assertEquals("Maria", MaisVelho.getPessoaMaisVelha(pessoas));
    }
}
