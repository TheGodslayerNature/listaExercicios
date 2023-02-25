package employer;
public class Employer {
    private final int id;
    private final String name;
    private double salary;
    Employer(int id, String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void increaseSalary(int id, double percentToIncrease){
            if (id == this.getId())
                this.salary = ((percentToIncrease * this.getSalary() / 100) + salary);
    }
}
