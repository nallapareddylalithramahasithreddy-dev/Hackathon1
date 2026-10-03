//1c) Methods:

// Write a Java program to calculate the total water consumption of a household using a method.

//Create the following method:

//calculateTotal(int morningUsage, int eveningUsage)
//The method should return the total water consumption. Read the morning and evening water usage from the user, call the method, and display the total consumption.

//Answer:(penalty regime: 0, 0, ... %)
//Ace editor not ready. Perhaps reload page?
//Falling back to raw text area.//



















import java.util.Scanner;

public class Waterconsumption {

    
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int morningUsage = sc.nextInt();
        int eveningUsage = sc.nextInt();

        
        int totalConsumption = calculateTotal(morningUsage, eveningUsage);

      
        System.out.println(totalConsumption);

        sc.close();
    }
}