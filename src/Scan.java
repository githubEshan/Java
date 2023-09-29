import java.util.Scanner;

public class Scan {

    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        String prefix = "Hello";
        System.out.println("Please enter your first name");
        String firstname = input.next();

        input.nextLine(); // Buffer to clear the current input

        System.out.println(prefix + " " + firstname +  "\n Please enter your desired major and graduating year ");

        String majorAndYear = input.nextLine();

        System.out.println("yo");

    }
}
