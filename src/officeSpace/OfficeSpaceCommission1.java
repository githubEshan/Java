package officeSpace;

import java.util.Scanner;

public class OfficeSpaceCommission1 {

    public static void main(String []args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter Realtor Name");
        String realtorName = input.nextLine();
        System.out.println("Enter width of office space in feet ");
        int officeWidth =  input.nextInt();
        System.out.println("Enter width of office length in feet ");
        int officeLength =  input.nextInt();

        int officeSpace = officeLength*officeWidth;
        double leasingFee = officeSpace*25;
        double leasingAgreement = leasingFee*12;
        double leasingCommission = leasingAgreement*0.05;

        System.out.println("Leasing Commission Summary");
        System.out.println("Realtor name: " + realtorName);
        System.out.println("Office space: " + officeSpace + " square feet");
        System.out.println("Leasing fee per month: " + "$"+leasingFee);
        System.out.println("Leasing agreement for one year: " + "$" + leasingAgreement);
        System.out.println("Leasing commission for this agreement: " + "$" + leasingCommission);

    }
}