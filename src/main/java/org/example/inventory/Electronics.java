package org.example.inventory;

public class Electronics extends Item{

    private int warrantee;

    public Electronics(int warrantee){
        this.warrantee = warrantee;
    }

    public Electronics(String id, String name, int quantity, double price, int warrantee) {
        super(id, name, quantity, price);

        this.warrantee = warrantee;
    }

    public int getWarrantee() {
        return warrantee;
    }
    public void setWarrantee(int warrantee) {
        this.warrantee = warrantee;
    }

}
