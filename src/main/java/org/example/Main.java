package org.example;

/** Classe principale pour tester Wallet */
public final class Main {

    private Main() { }

    /**
     * Point d'entrée du programme
     * @param args arguments de la ligne de commande
     */
    public static void main(final String[] args) {
        final double initialAmount = 100.0;
        final Wallet myWallet = new Wallet("red", "medium");
        myWallet.open();
        myWallet.addMoney(initialAmount);
        myWallet.checkMoney();
        myWallet.close();
    }
}
