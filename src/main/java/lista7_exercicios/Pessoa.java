package lista7_exercicios;

public class Pessoa {
    String name;
    private final int age;
    private final double height;
    Pessoa(String name, int idade, double altura){
        this.name = name;
        this.age = idade;
        this.height = altura;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }
    public boolean isLegalAge(){
        return age >= 16;
    }
}
