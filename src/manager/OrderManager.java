package manager;
import java.util.InputMismatchException;
import java.util.Scanner;

import models.Candy;
import models.Car;
import models.OatMilk;
import models.Pipe;
import models.Product;

public class OrderManager {
    private ProductList productList;

    public OrderManager() {
        productList = new ProductList();
    }

    // Lägger till en bil i products-listan
    public void addCar(String regNumber, String color, String brand) {
        productList.addProduct(new Car(regNumber, color, brand));
    }

    // Lägger till godis i products-listan
    public void addCandy(String taste, int numberOf) {
        productList.addProduct(new Candy(taste, numberOf));
    }

    // Lägger till rör i products-listan
    public void addPipe(double diameter, double length) {
        productList.addProduct(new Pipe(diameter, length));
    }

    // Lägger till havremjölk i products-listan
    public void addOatMilk(int fat, double liter) {
        productList.addProduct(new OatMilk(fat, liter));
    }

    // Visar alla produkter
    public void printProducts() {
        productList.printProducts();
    }

    // Metoder för att hantera beställningar för varje produkttyp
    public void handleCarOrder(Scanner scanner) {
        System.out.println("Ange registreringsnummer: ");
        String regNumber = scanner.nextLine();
        System.out.println("Ange färg: ");
        String color = scanner.nextLine();
        System.out.println("Ange bilmärke: ");
        String brand = scanner.nextLine();
        addCar(regNumber, color, brand);
    }

       public void handleCandyOrder(Scanner scanner) {
        try {
            System.out.println("Ange smak: ");
            String taste = scanner.nextLine();
            System.out.println("Ange antal: ");
            int numberOf = scanner.nextInt();
            scanner.nextLine();  
            addCandy(taste, numberOf);
        } catch (InputMismatchException e) {
            System.out.println("Fel: Ange ett giltigt heltal för antal.");
            scanner.nextLine();  
        }
    }

    public void handlePipeOrder(Scanner scanner) {
        try{
            System.out.println("Ange diameter: ");
            double diameter = scanner.nextDouble();
            System.out.println("Ange längd: ");
            double length = scanner.nextDouble();
            scanner.nextLine();
            addPipe(diameter, length);
        } catch (InputMismatchException e) {
            System.out.println("Fel: Ange ett giltigt decimaltal för diameter och längd.");
            scanner.nextLine();
        }
    }

    public void handleOatMilkOrder(Scanner scanner) {
        try {
            System.out.println("Ange fetthalt (%): ");
            int fat = scanner.nextInt();
            System.out.println("Ange liter: ");
            double liter = scanner.nextDouble();
            addOatMilk(fat, liter);
        } catch (InputMismatchException e) {
            System.out.println("Fel: Ange ett giltigt heltal för fetthalt och giltigt decimaltal för liter.");
            scanner.nextLine();
        }
    }

    // Metod för att lista alla produkter i en meny
    public void listAllOrders() {
        System.out.println("\n~~~ Alla Beställningar ~~~");

        System.out.println("\n~~~ Bilar ~~~");
        listCars();

        System.out.println("\n~~~ Godis ~~~");
        listCandies();

        System.out.println("\n~~~ Rör ~~~");
        listPipes();

        System.out.println("\n~~~ Havremjölk ~~~");
        listMilks();
    }

    // Metoder för att lista produkter av olika typer
    private void listCars() {
        for (Product product : productList.getProducts()) {
            if (product instanceof Car) {
                System.out.println(product);
            }
        }
    }

    private void listCandies() {
        for (Product product : productList.getProducts()) {
            if (product instanceof Candy) {
                System.out.println(product);
            }
        }
    }

    private void listPipes() {
        for (Product product : productList.getProducts()) {
            if (product instanceof Pipe) {
                System.out.println(product);
            }
        }
    }

    private void listMilks() {
        for (Product product : productList.getProducts()) {
            if (product instanceof OatMilk) {
                System.out.println(product);
            }
        }
    }

}
