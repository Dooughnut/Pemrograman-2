package Soal1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double widht){
        this.length = length;
        this.width = widht;
    }

    public double area(){
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString("Rectangle") + " of length " + length + " and width " + width;
    }
}
