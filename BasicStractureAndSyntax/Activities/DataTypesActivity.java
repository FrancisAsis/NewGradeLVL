package BasicStractureAndSyntax.Activities;

public class DataTypesActivity {

    public static void main(String[] args) {

        System.out.println("===== TO-DO LIST TRACKER =====");

        // Task Information
        char taskCode = 'A';
        System.out.println("Task Code: " + taskCode);

        byte priority = 1; // 1 = Highest Priority
        System.out.println("Priority Level: " + priority);

        short estimatedMinutes = 90;
        System.out.println("Estimated Time (minutes): " + estimatedMinutes);

        int taskID = 10001;
        System.out.println("Task ID: " + taskID);

        long totalStudySeconds = 5400L;
        System.out.println("Total Study Time (seconds): " + totalStudySeconds);

        float progress = 75.5f;
        System.out.println("Progress: " + progress + "%");

        double completionRate = 98.75d;
        System.out.println("Completion Rate: " + completionRate + "%");

        boolean isFinished = false;
        System.out.println("Task Completed: " + isFinished);

        // Scientific notation examples
        float storageUsed = 2.5e2f; // 250 MB
        System.out.println("Storage Used: " + storageUsed + " MB");

        double totalPoints = 1.5e3d; // 1500 points
        System.out.println("Total Points Earned: " + totalPoints);

        // Status Symbols
        char pending = '!';
        char openBracket = '(';
        char closeBracket = ')';

        System.out.println("Status Symbol: " + pending);
        System.out.println("Extra Symbols: " + openBracket + " " + closeBracket);
    }

}
    

