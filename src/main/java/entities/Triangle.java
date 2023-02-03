package entities;

public class Triangle {
    private double a, b, c;
    Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double areaCalculate(){
        double p = (getA() + getB() + getC()) / 2.0;
        return Math.sqrt(p *(p - getA()) * (p - getB()) * (p - getC()));
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    @Override
    public boolean equals(Object obj){
        return obj instanceof Triangle;
    }
}

