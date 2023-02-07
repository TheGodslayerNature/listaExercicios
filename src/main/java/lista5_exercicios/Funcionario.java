package lista5_exercicios;

public class Funcionario {
    private String name;
    private double grossSalary;
    private double percentage;
    public void setName(String name){
        this.name = name;
    }
    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }
    public double getGrossSalary() {
        return grossSalary;
    }
    public double getSalary(){
        int TAX = 1000;
        double salary = grossSalary - TAX;
        return salary;
    }
    public String getNomeFuncionario(){
        return name;
    }
    public void increseSalary(double percentage){
        this.percentage = percentage;
        grossSalary += grossSalary * percentage / 100;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nGross salary: %.2f%nTax: 1000.00%n" +
                "Empleyee: %s, $ %.2f%nWhich percentage to increase salary? %.2f%n" +
                "Updated data: %s, $ %.2f",name,getGrossSalary(),name,getSalary(), percentage,name,getSalary());
    }
}
