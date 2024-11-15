package models;
public class OatMilk extends Product{
    int fat;
    double liter;

    public OatMilk(int fat, double liter) {
        this.fat = fat;
        this.liter = liter;
    }

    public int getFat() {
        return fat;
    }

    public double getLiter() {
        return liter;
    }

    @Override
    public String toString() {
        return "Fetthalt: " + fat + "%, Liter: " + liter + "l";
    }
}
