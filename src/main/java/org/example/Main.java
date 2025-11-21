package org.example;

public final class Main {

    private Main() { }

    public static void main(final String[] args) {
        final Wallet myWallet = new Wallet("red", "medium");
        myWallet.open();
        myWallet.addMoney(100.0);
        myWallet.checkMoney();
        myWallet.close();
    }
}
