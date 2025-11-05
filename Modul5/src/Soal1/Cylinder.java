package Soal1;

public class Cylinder extends Shape{
    private double radius;
    private double height;

    public Cylinder(double radius, double height){
        this.height = height;
        this.radius = radius;
    }

    public double area(){
        return 2 * Math.PI * (radius*radius) + (2 * Math.PI * radius * height);
    }

    @Override
    public String toString() {
        return super.toString("Cylinder") + " of radius " + radius + " and height " + height;
    }
}
