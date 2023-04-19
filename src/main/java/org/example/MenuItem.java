package org.example;

public class MenuItem {
    private final String food;
    private final int price;

    public MenuItem(String food, int price) {
        this.food = food;
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    public String getFood() {
        return food;
    }
}
