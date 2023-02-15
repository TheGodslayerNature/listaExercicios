package lista7_exercicios;

public class Pessoa {
    private final String name;
    private final int age;
    private double height;
    Pessoa(String name, int idade, double altura){
        this.name = name;
        this.age = idade;
        this.height = altura;
    }
    Pessoa(String name, int idade){
        this.name = name;
        this.age = idade;
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
