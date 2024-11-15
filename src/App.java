import java.util.InputMismatchException;
import java.util.Scanner;

import manager.OrderManager;
import menu.Menu;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        OrderManager orderManager = new OrderManager();
        boolean running = true;

        // Visa menyn och hantera användarens val
        while (running) {
            Menu.showMenu();
            int choice = getUserChoice(scanner);
            
            switch (choice) {
                case 1:
                    orderManager.handleCarOrder(scanner);
                    break;
                case 2:
                    orderManager.handleCandyOrder(scanner);
                    break;
                case 3:
                    orderManager.handlePipeOrder(scanner);
                    break;
                case 4:
                    orderManager.handleOatMilkOrder(scanner);
                    break;
                case 5:
                    orderManager.listAllOrders();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Ogiltig val. Försök igen.");
                    break;
            }
        }

        scanner.close();
        System.out.println("Programmet avslutas.");    
        
    }

    // Metod för att hämta ett giltigt val från användaren
    private static int getUserChoice(Scanner scanner) {
    int choice = -1;  
    boolean validChoice = false;
    
    while (!validChoice) {
        try {
            choice = scanner.nextInt();
            scanner.nextLine();  
            if (choice >= 1 && choice <= 6) {
                validChoice = true;  
            } else {
                System.out.println("Ogiltigt val. Välj mellan 1 och 6.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ogiltig inmatning. Vänligen ange ett nummer mellan 1 och 6.");
            scanner.nextLine();  
        }
    }
    return choice;
    }

}

