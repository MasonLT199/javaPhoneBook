/*||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*
|                                                           |
|                     Java Phone Book                       |
|         Created by: Mason Timmerman and Max DeVos         |
|                     December 2017                         |
|                                                           |
*|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {

        //standard input object
        Scanner sc = new Scanner(System.in);

        //ask for each value and scan
        System.out.println("Please enter your information for the Java Phone Book");
        //first name
        System.out.println("First Name: ");
        String firstName = sc.nextLine();

        //middle initial
        System.out.println("Middle Initial: ");
        char middleInitial = sc.next().charAt(0);

        //last name
        System.out.println("Last Name: ");
        String lastName = sc.nextLine();

        //age
        System.out.println("Age: ");
        int age = sc.nextInt();

        //phone number
        System.out.println("Phone Number: ");
        long phoneNumber = sc.nextLong();

        //send the values read to the NewEntry class and create an object
        NewEntry person = new NewEntry(firstName, middleInital, lastName, age, phoneNumber);

    }
}
