package foodordering;

import java.util.ArrayList;

public class Menu {
    private ArrayList<FoodItem> items;

    public Menu() {
        items = new ArrayList<>();
        items.add(new FoodItem("Burger", 5.99));
        items.add(new FoodItem("Pizza", 8.99));
        items.add(new FoodItem("Pasta", 7.99));
        items.add(new FoodItem("Salad", 4.99));
        items.add(new FoodItem("Soda", 1.99));
    }

    public void displayMenu() {
        System.out.println("--- Food Menu ---");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getName() + ": $" + items.get(i).getPrice());
        }
    }

    public FoodItem getFoodItem(int index) {
        return items.get(index);
    }

    public int getSize() {
        return items.size();
    }
}
