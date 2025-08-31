package org.example.inventory;

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
    }
}
