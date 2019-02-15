package za.ac.cput.projectone;
import java.util.Scanner;
/**
 * Ryan Petersen
 * 217027806
 * 3B
 */
public class AgeCalculator
{
    /*Age Calculator*/

    static Scanner reader = new Scanner(System.in);

    public static void main( String[] args ) {

        int currentYear;
        int birthdate;
        String name;
        String surname;

        System.out.println("Enter your name");
        name = reader.next();
        System.out.println("Enter your surname");
        surname = reader.next();
        System.out.println("Enter current year");
        currentYear = reader.nextInt();
        System.out.println("Enter birth year");
        birthdate = reader.nextInt();
        int age = currentYear - birthdate;
        System.out.println("Your name and surname is : " + name + " " + surname + " and your age is : " + age);


    }


}

