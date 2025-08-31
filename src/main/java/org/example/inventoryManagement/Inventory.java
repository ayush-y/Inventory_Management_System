package org.example.inventoryManagement;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory <T extends Item> {
    private HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }
    public void addItem(T item) {
        items.put(item.getId(), item);
    }
    public void removeItem(T item) {
        items.remove(item.getName());
    }
    public void remove(String itemId) {
        items.remove(itemId);
    }
    public T getItem(String name) {
        return items.get(name);
    }

    public T get(String itemId) {
        return items.get(itemId);
    }

    public ArrayList<T> getAllItems() {
        return new ArrayList<>(items.values());
    }


}
