package mailAgreement;

import java.util.Scanner;

public class Delivery1 {
    public static void main( String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the distance between location 1 and 2");
        int distance = input.nextInt();
        System.out.println("Please enter the weight");
        double weight = input.nextDouble();
        double fee = 0;

        if (distance == 1 && weight <5){
            fee = 12.00;
        }
        else if (distance == 1 && weight > 5 && weight < 20) {
            fee = 16.50;
        }
        else if (distance == 1 && weight > 20) {
            fee = 22.00;
        }
        if (distance == 2 && weight <5 ) {
            fee = 35.00;
        }
        else if (distance ==2 && weight > 5){
            fee = 47.95;
        }

        if (distance ==1){
            System.out.println("Delivery Type: Local - Weight: " + weight);
            System.out.println("Fee " + "$" +fee);

        }

        if (distance ==2){
            System.out.println("Delivery Type: Long - Weight: " + weight);
            System.out.println("Fee " + "$" +fee);
        }
    }
}
