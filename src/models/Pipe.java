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
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Diametern är: " + diameter + "m, Längden är: " + length + "m";
    }
    
}
