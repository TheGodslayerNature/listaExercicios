package lista5_exercicios;

import java.util.Locale;

public class Student {
    private String name;
    private double firstGrade, secondGrade, thirdGrade;
    public void setName(String name){
        this.name = name;
    }
    public void setFirstGrade(double firstGrade){
        this.firstGrade = firstGrade;
    }
    public void setSecondGrade(double secondGrade){
        this.secondGrade = secondGrade;
    }
    public void setThirdGrade(double thirdGrade){
        this.thirdGrade = thirdGrade;
    }
    public String getName(){
        return name;
    }
    public double getFirstGrade(){
        return firstGrade;
    }
    public double getSecondGrade(){
        return secondGrade;
    }
    public double getThirdGrade(){
        return thirdGrade;
    }
    public double finalGrade(){
        return firstGrade + secondGrade + thirdGrade;
    }
    public String pointsMissing(){
        Locale.setDefault(Locale.ENGLISH);
        double min = 60;
        if (finalGrade() < min){
            return String.format("FAILED%nMISSING %.2f",min - finalGrade()) ;
        }
        return "PASS";
    }
}
