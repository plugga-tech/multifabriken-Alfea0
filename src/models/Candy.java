package models;
public class Candy extends Product {
    String taste;
    int numberOf;

    public Candy(String taste, int numberOf) {
        this.taste = taste;
        this.numberOf = numberOf;
    }

    public String getTaste() {
        return taste;
    }

    public int getNumberOf() {
        return numberOf;
    }

    @Override
    public String toString() {
        return "Smak: " + taste + ", Antal: " + numberOf;
    }

}
