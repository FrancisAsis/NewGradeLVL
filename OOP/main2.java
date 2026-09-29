package OOP;

public class jeepney {
    String color;
    int capacity;

    void drive() {
        System.out.println("The jeepney is driving.");
    }
}

public class main2 {
    public static void main(String[] args) {
        jeepney myJeepney = new jeepney();
        myJeepney.color = "Blue";
        myJeepney.capacity = 20;
        myJeepney.drive();
    }
}
