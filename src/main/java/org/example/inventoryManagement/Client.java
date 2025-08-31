package org.example.inventoryManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client{
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();

        items.add(new Clothing ("1", "T-Shirt", 50, 19.99, "M"));
        items.add(new Electronics("2", "Smartphone", 30, 699.99, 24));
        items.add(new Book("3", "Java Programming", 20, 39.99, "John Doe"));
        System.out.println("Inventory Items:");
        for (Item item : items) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName() + ", Price: $" + item.getPrice());
        }
        Collections.sort(items); //based on price
        System.out.println("\nSorted Inventory Items by Price:");
        for (Item item : items) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName() + ", Price: $" + item.getPrice());
        }
        System.out.println("Electronic Items");
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.addItem(new Electronics("2", "Smartphone", 30, 699.99, 24));
        electronicsInventory.addItem(new Electronics("3", "TV", 3, 69.00, 14));;
        electronicsInventory.addItem(new Electronics("1", "Clothing", 50, 19.99, 24));
        electronicsInventory.remove("3");
        System.out.println("Item List from inventory ");
        for (Item item : electronicsInventory.getAllItems()) {
            System.out.println(item.getId() + ", Name: " + item.getName() + ", Price: $" + item.getPrice());
        }

        System.out.println("Book inventory");

        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.addItem(new Book("3", "Java Programming", 20, 39.99, "John Doe"));
        bookInventory.addItem(new Book("4", "Harry potter", 20, 39.99, "J.K.Rollin"));
        for (Item item : bookInventory.getAllItems()) {
            System.out.println(item.getId() + ", Name: " + item.getName() + ", Price: $" + item.getPrice());
        }
    }
}
