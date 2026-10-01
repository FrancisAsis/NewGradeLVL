package OOP;

import java.util.Scanner;

class Wallet {

    String WalletDesign;
    String WalletColor;
    double WalletMoney;

    void OpenWallet() {
        System.out.println("The " + WalletDesign + " wallet was opened.");
    }

    void AddMoney() {
        System.out.println("Money was added to the " + WalletDesign + " wallet.");
    }

    void TakeMoney() {
        System.out.println("Money was taken from the " + WalletDesign + " wallet.");
    }

    void showInfo() {
        System.out.println(WalletDesign + " | " + WalletColor + " | ₱" + WalletMoney);
    }
}

public class OwnExampleWallet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Wallet myWallet = new Wallet();

        int choice;
        int colorChoice;

        // WALLET DESIGN
        System.out.println("=== CHOOSE WALLET DESIGN ===");
        System.out.println("1. Spiderman");
        System.out.println("2. HelloKitty");
        System.out.println("3. Minecraft");

        System.out.print("Choose 1-3: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                myWallet.WalletDesign = "Spiderman";
                break;

            case 2:
                myWallet.WalletDesign = "HelloKitty";
                break;

            case 3:
                myWallet.WalletDesign = "Minecraft";
                break;
        }

        // WALLET COLOR
        System.out.println("=== CHOOSE WALLET COLOR ===");
        System.out.println("1. Red");
        System.out.println("2. Pink");
        System.out.println("3. Green");

        System.out.print("Choose 1-3: ");
        colorChoice = input.nextInt();

        switch (colorChoice) {
            case 1:
                myWallet.WalletColor = "Red";
                break;

            case 2:
                myWallet.WalletColor = "Pink";
                break;

            case 3:
                myWallet.WalletColor = "Green";
                break;
        }

        // WALLET MONEY
        System.out.print("\nEnter wallet money: ");
        myWallet.WalletMoney = input.nextDouble();

        // INFORMATION
        System.out.println("\n=== WALLET INFORMATION ===");

        myWallet.showInfo();
        myWallet.OpenWallet();
        myWallet.AddMoney();
        myWallet.TakeMoney();

        input.close();
    }
}