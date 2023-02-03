package lista5_exercicios;

public class Funcionario {
    String name;
    double grossSalary;
    final int TAX = 1000;
    public void setName(String name){
        this.name = name;
    }
    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }
    public double getSalary(){
        return grossSalary - TAX;
    }
    public void increseSalary(double percentage){

    }
}
