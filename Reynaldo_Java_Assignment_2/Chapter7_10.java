
public class Chapter7_10 {
    public static void main(String[] args) {
        int[] salaryRanges = new int[9]; 
        int[] grossSales = {1000, 2000, 300, 4000, 5000, 4500, 3500, 2500, 1500, 5000, 700, 8000, 6000};

        for (int sales : grossSales) {
            double salary = 200 + (0.09 * sales); // Calculate salary
            int rangeIndex = (int) (salary / 100); 
            if (rangeIndex < salaryRanges.length) {
                salaryRanges[rangeIndex]++; 
            } else {
                salaryRanges[salaryRanges.length - 1]++; 
            }
        }

        // Printing the results 
        System.out.println();
        System.out.println("Salary Range\tNumber of Salespeople");
        System.out.println("-----------------------------------");
        for (int i = 0; i < salaryRanges.length; i++) {
            String range;
            switch (i) {
                case 0:
                    range = "$200 - $299";
                    break;
                case 1:
                    range = "$300 - $399";
                    break;
                case 2:
                    range = "$400 - $499";
                    break;
                case 3:
                    range = "$500 - $599";
                    break;
                case 4:
                    range = "$600 - $699";
                    break;
                case 5:
                    range = "$700 - $799";
                    break;
                case 6:
                    range = "$800 - $899";
                    break;
                case 7:
                    range = "$900 - $999";
                    break;
                case 8:
                    range = "$1000 and over";
                    break;
                default:
                    range = "Invalid Range";
                    break;
            }
            System.out.printf("%-20s\t%d%n", range, salaryRanges[i]);
        }
        System.out.println();
    } // main
} // class