package OperationWithSwitch;

public class Operation {

    public static void main(String[] args) {
        //If statement
        boolean assignmentDone = true;

        if (assignmentDone) {
            System.out.println("You can play now!");
        }

        // If - Else statement

        boolean wearingID = true;

        if (wearingID) {
            System.out.println("You may enter the school.");
        } else {
            System.out.println("Please wear your school ID.");
        }


        // If - ElseIf - Else statement
        int minutesBeforeClass = 15;

        if (minutesBeforeClass >= 15) {
            System.out.println("Students are chatting with their classmates.");
        } else if (minutesBeforeClass >= 5) {
            System.out.println("Students are preparing their notebooks and pens.");
        } else if (minutesBeforeClass >= 1) {
            System.out.println("Students are sitting quietly and waiting for the teacher.");
        } else {
            System.out.println("The teacher has arrived. Class is starting!");
        }

        // Switch statement
        String subject = "Science";

        switch (subject) {
            case "Math":
                System.out.println("Solve math problems.");
                break;

            case "Science":
                System.out.println("Do a science experiment.");
                break;

            case "English":
                System.out.println("Read a story.");
                break;

            default:
                System.out.println("No class today.");
        }

    }
}