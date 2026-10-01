package OOP;

public class Jeepney {
    String color;
    int capacity;

    void drive() {
        System.out.println("The jeepney is driving.");
    }
}

public class main2 {
    public static void main(String[] args) {
        Jeepney myJeepney = new Jeepney();
        myJeepney.color = "Blue";
        myJeepney.capacity = 20;
        myJeepney.drive();
    }
}
