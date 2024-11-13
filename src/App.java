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

    private static int getUserChoice(Scanner scanner) {
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        return choice;
    }

}

