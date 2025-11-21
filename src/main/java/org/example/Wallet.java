package org.example;

/**
 * Représente un portefeuille avec une couleur, taille et argent.
 */
public final class Wallet {

    /** Couleur du portefeuille */
    private String color;

    /** Taille du portefeuille */
    private String size;

    /** Montant d'argent disponible */
    private double money;

    /** Indique si le portefeuille est ouvert */
    private boolean isOpen;

    /** Indique si le portefeuille est perdu */
    private boolean isLost;

    /**
     * Crée un portefeuille avec une couleur et une taille.
     * @param colorParam couleur du portefeuille
     * @param sizeParam taille du portefeuille
     */
    public Wallet(final String colorParam, final String sizeParam) {
        this.color = colorParam;
        this.size = sizeParam;
        this.money = 0;
        this.isOpen = false;
        this.isLost = false;
    }

    /** Ouvre le portefeuille */
    public void open() { this.isOpen = true; }

    /** Ferme le portefeuille */
    public void close() { this.isOpen = false; }

    /**
     * Ajoute de l'argent dans le portefeuille
     * @param amount montant à ajouter
     */
    public void addMoney(final double amount) {
        if (!isOpen) {
            System.out.println("Wallet is closed!");
            return;
        }
        this.money += amount;
    }

    /** Retourne le montant d'argent disponible */
    public double getMoney() { return this.money; }

    /** Vérifie si le portefeuille est perdu */
    public boolean isLost() { return this.isLost; }

    /**
     * Définit l'état perdu du portefeuille
     * @param lost true si perdu, false sinon
     */
    public void setLost(final boolean lost) { this.isLost = lost; }

    /** Affiche le montant d'argent dans le portefeuille */
    public void checkMoney() {
        System.out.println("Money: " + this.money);
    }
}
