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

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }

    @Override
    public String toString() {
        return "Smak: " + taste + ", Antal: " + numberOf;
    }

}
