package models;
public class Pipe extends Product {
    double diameter;
    double length;

    public Pipe(double diameter, double length) {
        this.diameter = diameter;
        this.length = length;
    }
    
    public double getDiameter() {
        return diameter;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Diametern är: " + diameter + "m, Längden är: " + length + "m";
    }
    
}
