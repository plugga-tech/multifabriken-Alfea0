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

    public void setFat(int fat) {
        this.fat = fat;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }

    @Override
    public String toString() {
        return "Fetthalt: " + fat + "%, Liter: " + liter + "l";
    }
}
