package Soal1;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }
    public double area(){
        return 4 * Math.PI * (radius*radius);
    }

    @Override
    public String toString() {
        return super.toString("Sphere") + " of radius " + radius;
    }
}
