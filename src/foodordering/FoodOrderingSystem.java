package foodordering;

import java.util.Scanner;

public class FoodOrderingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Order order = new Order();
        int choice;

        do {
            System.out.println("\n--- Food Ordering System ---");
            System.out.println("1. View Menu");
            System.out.println("2. Place an Order");
            System.out.println("3. View Order");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    menu.displayMenu();
                    break;

                case 2:
                    menu.displayMenu();
                    System.out.print("Enter the number of the food item to add to your order: ");
                    int itemNumber = scanner.nextInt();
                    if (itemNumber > 0 && itemNumber <= menu.getSize()) {
                        order.addItem(menu.getFoodItem(itemNumber - 1));
                        System.out.println(menu.getFoodItem(itemNumber - 1).getName() + " added to your order.");
                    } else {
                        System.out.println("Invalid item number.");
                    }
                    break;

                case 3:
                    order.displayOrder();
                    break;

                case 4:
                    order.displayOrder();
                    System.out.println("Thank you for your order!");
                    choice = 5;  // Exit the loop
                    break;

                case 5:
                    System.out.println("Exiting Food Ordering System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
