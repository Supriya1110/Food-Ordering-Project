# Food Ordering System 

A simple Java-based **Food Ordering System** that demonstrates Object-Oriented Design (OOD) principles. This project organizes functionalities into different classes like `FoodItem`, `Menu`, `Order`, and `FoodOrderingSystem` for better maintainability and modularity.

## Features

- **View Menu**: Displays the list of available food items along with their prices.
- **Place an Order**: Allows the user to select food items and add them to their order.
- **View Order**: Shows the items added to the order along with the total price.
- **Checkout**: Completes the order and exits the system.

## Project Structure

    foodordering/
    ├── FoodItem.java          
    ├── Menu.java              
    ├── Order.java            
    └── FoodOrderingSystem.java 



## Classes Overview

### 1. `FoodItem.java`
This class represents an individual food item with:
- **Attributes**: `name`, `price`
- **Methods**: Getters for retrieving the name and price of the item.

### 2. `Menu.java`
This class manages the list of available food items and includes:
- **Attributes**: `items` (a list of `FoodItem`)
- **Methods**: 
  - `displayMenu()`: Displays all food items with prices.
  - `getFoodItem(index)`: Returns the selected food item.

### 3. `Order.java`
This class stores and manages the items added to an order:
- **Attributes**: `orderedItems` (a list of ordered `FoodItem`)
- **Methods**:
  - `addItem(item)`: Adds a selected food item to the order.
  - `displayOrder()`: Displays all items in the order and calculates the total.

### 4. `FoodOrderingSystem.java`
This is the main class that provides the interaction interface for users:
- **Methods**:
  - Displays menu options.
  - Allows the user to view the menu, place orders, view the current order, and checkout.


## Example Interaction

![image](https://github.com/user-attachments/assets/e302a1c7-8ef5-43e7-8840-02a99833f252)


## Future Enhancements
1. Add more food items and categories.
2. Implement payment methods.
3. Add user authentication for repeat customers.
4. Store order history for future reference.

## License
This project is licensed under the MIT License. See the LICENSE file for details.


