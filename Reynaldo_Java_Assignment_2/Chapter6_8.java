
import java.util.Scanner;

public class Chapter6_8 {
    private static int maximunHours = 3;
    private static double minimumFee = 2.00;
    private static double additionalFeePerHour = 0.50;
    private static double maximumDayCharge = 10.00;

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        double totalCharges = 0.00;

        System.out.println();
        System.out.print("Enter Number of Customers : ");
        int customers = input.nextInt();

        for (int i = 1; i <= customers; i++) {
            System.out.print("Enter hours parked for customer " + i + ": ");
            int hoursParked = input.nextInt();
            double charge = calculateCharges(hoursParked);
            totalCharges += charge;

            System.out.printf("Customer %d parking Total charge is : $%.2f\n", i, charge);
            System.out.println();
        }
        System.out.printf("Total parking charges for yesterday is $%.2f\n", totalCharges);
        System.out.println();
        
        input.close(); 
    } // main

    private static double calculateCharges(int hours) {
        double charge = minimumFee;

        if (hours > maximunHours) {
            charge += (hours - maximunHours) * additionalFeePerHour;
        }

        return Math.min(charge, maximumDayCharge);
    }

} // class
    

