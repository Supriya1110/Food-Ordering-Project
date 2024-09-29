package foodordering;

import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> orderedItems;

    public Order() {
        orderedItems = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        orderedItems.add(item);
    }

    public void displayOrder() {
        System.out.println("--- Your Order ---");
        double total = 0;
        for (FoodItem item : orderedItems) {
            System.out.println(item.getName() + ": $" + item.getPrice());
            total += item.getPrice();
        }
        System.out.printf("Total: $%.2f%n", total);
    }
}
