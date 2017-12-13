/*||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*
|                                                           |
|                     Java Phone Book                       |
|         Created by: Mason Timmerman and Max DeVos         |
|                     December 2017                         |
|                                                           |
*|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args){



        //standard input object
        Scanner sc = new Scanner(System.in);

        //ask for each value and scan
        System.out.println("\nPlease enter your information for the Java Phone Book");
        //first name
        System.out.print("  First Name: ");
        String firstName = sc.nextLine();

        //middle initial
        System.out.print("  Middle Initial: ");
        String middleInitial = sc.nextLine();

        //last name
        System.out.print("  Last Name: ");
        String lastName = sc.nextLine();

        //age
        System.out.print("  Age: ");
        int age = sc.nextInt();

        //phone number
        System.out.print("  Phone Number: ");
        long phoneNumber = sc.nextLong();

        //send the values read to the NewEntry class and create an object
        NewEntry person = new NewEntry(firstName, middleInitial, lastName, age, phoneNumber);

    }
}
