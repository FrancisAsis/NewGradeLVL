package OOP;

import java.util.Scanner;

class House {

    String HouseOwner;
    String HouseAddress;
    String HouseColor;

    void OpenDoor() {
        System.out.println(HouseOwner + " opened the door.");
    }

    void OpenWindow() {
        System.out.println(HouseOwner + " opened the window.");
    }

    void Parking() {
        System.out.println(HouseOwner + " parked the car.");
        
    }
    
    void showInfo() {
        System.out.println(HouseOwner + " | " + HouseAddress + " | " + HouseColor);
    }
}

public class OwnExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        House myHouse = new House();

        System.out.print("Enter house owner: ");
        myHouse.HouseOwner = input.nextLine();

        System.out.print("Enter house address: ");
        myHouse.HouseAddress = input.nextLine();

        System.out.print("Enter house color: ");
        myHouse.HouseColor = input.nextLine();

        System.out.println("\n=== HOUSE INFORMATION ===");

        myHouse.showInfo();
        myHouse.OpenDoor();
        myHouse.OpenWindow();
        myHouse.Parking();

        input.close();
    }
}