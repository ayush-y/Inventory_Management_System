package org.example.inventoryManagement;

public class Item implements Comparable<Item> {

    String id ;

    String name;

    int quantity;

    double price;

    public Item(){

    }

    public Item(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Item other) {
        // one item is less than, equal to, or greater than the specified item
        // based on their price

        if(this.price > other.price) {
            return 1;
        } else if(this.price < other.price) {
            return -1;
        } else {
            return 0;
        }
    }
}
