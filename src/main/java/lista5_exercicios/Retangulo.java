package lista5_exercicios;

public class Retangulo {
    private double width, height;
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2 * (width + height);
    }
    public double diagonal(){
        double p = Math.pow(width,2) + Math.pow(height,2);
        return Math.sqrt(p);
    }
}
