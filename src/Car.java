public class Car extends Product {
    private String regNumber;
    private String color;
    private String brand;

    public Car(String regNumber, String color, String brand) {
        this.regNumber = regNumber;
        this.color = color;
        this.brand = brand;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Regestreringsnummer: " + regNumber + ", Färg: " + color + ", Bilmärke: " + brand;
     } 
    
}
