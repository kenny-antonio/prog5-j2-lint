package org.example;

public final class Wallet {
    private String color;
    private String size;
    private double money;
    private boolean isOpen;
    private boolean isLost;

    public Wallet(final String color, final String size) {
        this.color = color;
        this.size = size;
        this.money = 0;
        this.isOpen = false;
        this.isLost = false;
    }

    public void open() {
        this.isOpen = true;
    }

    public void close() {
        this.isOpen = false;
    }

    public void addMoney(final double amount) {
        if (!isOpen) {
            System.out.println("Wallet is closed!");
            return;
        }
        this.money += amount;
    }

    public double getMoney() {
        return this.money;
    }

    public boolean isLost() {
        return this.isLost;
    }

    public void setLost(final boolean lost) {
        this.isLost = lost;
    }

    public void checkMoney() {
        System.out.println("Money: " + this.money);
    }
}