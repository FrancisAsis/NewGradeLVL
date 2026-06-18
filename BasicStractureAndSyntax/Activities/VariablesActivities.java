package BasicStractureAndSyntax.Activities;

public class VariablesActivities {
    public static void main(String[] args) {
         
        System.out.println("===Water Bottle Nutrition Facts===");
        String name = "WaterBottle NutritionFacts";
        String date = "6/18/26";
        final int NumberOfBottles = 10;
        String Water = "Water is essential for life and has various health benefits.";
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Number of Bottles: " + NumberOfBottles);
        System.out.println("Water: " + Water);

        float ServingSize = 16.9f; // in milliliters
        System.out.println("Serving Size: " + ServingSize + " ml");
        int Calories = 0;
        System.out.println("Calories: " + Calories);
        int TotalFat = 0; // in grams
        System.out.println("Total Fat: " + TotalFat + " g");
        int Sodium = 0; // in milligrams
        System.out.println("Sodium: " + Sodium + " mg");
        int TotalCarbohydrate = 0; // in grams
        System.out.println("Total Carbohydrate: " + TotalCarbohydrate + " g");
        int Protein = 0; // in grams
        System.out.println("Protein: " + Protein + " g");

        boolean isHealthy = true;
        System.out.println("Is it healthy? " + isHealthy);

    }
    
}
