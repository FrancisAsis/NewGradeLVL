package Loop;

public class Switch {
    public static void main(String[] args) {
        String light = "Green";

        switch (light) {
            case "Red":
                System.out.println("Stop!");
                break;
                
            case "Yellow":
                System.out.println("Get Ready!");
                break;

            case "Green":
                System.out.println("Go!");
                break;

            default:
                System.out.println("Invalid traffic light.");
        }
    }
}