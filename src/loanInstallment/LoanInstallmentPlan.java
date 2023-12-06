package loanInstallment;

import java.util.Scanner;

public class LoanInstallmentPlan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the loan installment plan! The interest rate for all loans will be 3.9%! \n" +
                "please enter your first name");
        String firstname = input.next(); // first name

        System.out.println("please enter your last name");
        String lastname = input.next(); //last name

        input.nextLine();

        System.out.println("please enter your Billing address ");
        String billingAddress = input.nextLine(); //billing

        System.out.println("please enter the loan amount ");
        int loanAmount = input.nextInt(); //Loan amount

        System.out.println("please enter the loan period in months ");
        int loanPeriod = input.nextInt(); //Loan Period



        double interestAmount =  loanAmount *1.039 ;
        double totalLoanAmount = loanAmount + interestAmount;
        double monthlyPayment = totalLoanAmount/loanPeriod;

        System.out.println("Borrower: " + firstname + " " + lastname);
        System.out.println("Billing Address: "+ billingAddress);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Amount: " +interestAmount);
        System.out.println("Total Loan Amount: " + totalLoanAmount);
        System.out.println("Term of Loan: " + loanPeriod + " months");
        System.out.println("Payment/month: "+ monthlyPayment);
    }
}