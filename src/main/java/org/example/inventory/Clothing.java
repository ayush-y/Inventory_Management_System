package org.example.inventory;

public class Clothing extends Item{

    String size;

    public Clothing(String size) {
        this.size = size;
    }
    public Clothing(String id, String name, int quantity, double price,  String size) {
        super(id, name, quantity, price);

        this.size = size;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
}
