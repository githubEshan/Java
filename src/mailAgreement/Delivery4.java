package mailAgreement;

import java.util.Scanner;
public class Delivery4 {
    public static void main( String [] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int localCounter = 0;
        int longCounter = 0;
        double localFee = 0;
        double longFee= 0;
        double totalLocalFee = 0;
        double totalLongFee= 0;
        while (i == 1) {
            System.out.println("Please enter the distance between location 1 and 2");
            int distance = input.nextInt();
            System.out.println("Please enter the weight");
            double weight = input.nextDouble();
            if (distance == 1 && weight <5){
                localFee = 12.00;
                localCounter ++;
            }
            else if (distance == 1 && weight > 5 && weight < 20) {
                localFee =16.50;
                localCounter ++;
            }
            else if (distance == 1 && weight > 20) {
                localFee = 22.00;
                localCounter ++;
            }
            if (distance == 2 && weight <5 ) {
                longFee = 35.00;
                longCounter ++;
            }
            else if (distance ==2 && weight > 5){
                longFee = 47.95;
                longCounter ++;
            }

            if (distance ==1){
            System.out.println("Delivery Type: Local - Weight: " + weight);
            System.out.println("Fee " + "$" +localFee);
            System.out.println("(1) To contniue : (0) To exit");
            i = input.nextInt();
            }

            if (distance ==2){
                System.out.println("Delivery Type: Long - Weight: " + weight);
                System.out.println("Fee " + "$" +longFee);
                System.out.println("(1) To contniue : (0) To exit");
                i = input.nextInt();
            }


            if (distance == 1) {
                totalLocalFee += localFee;
            } else if (distance == 2) {
                totalLongFee += longFee;
            }
        }

        System.out.println("Summary of devilery services: ");
        System.out.println("local delivery: " + localCounter + " items");
        System.out.println("Total Local delivery Fee " + "$"  + totalLocalFee);
        System.out.println("long delivery: " + longCounter + " items");
        System.out.println("Total Long delivery Fee " + "$" + totalLongFee);
        double totalFee = totalLocalFee +totalLongFee;
        System.out.println("Total Fee: "+ totalFee);
    }
}
