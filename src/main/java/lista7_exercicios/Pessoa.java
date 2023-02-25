package lista7_exercicios;

public class Pessoa {
    private String name;
    private int age;
    private double height;
    private char genero;
    Pessoa(String name, int idade, double altura){
        this.name = name;
        this.age = idade;
        this.height = altura;
    }
    Pessoa(String name, int idade){
        this.name = name;
        this.age = idade;
    }
//    Pessoa(double height, int age, char genero){
//        this.height = height;
//        this.age = age;
//        this.genero = genero;
//    }
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
