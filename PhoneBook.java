/*|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*
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

        //welcome and option menu
        System.out.println("\nWelcome to the Java Phone Book by Mason and Max!");
        System.out.println("\n  Enter what you would like to do with the corresponding number: ");
        System.out.print("   1 - Search \n   2 - Make a new entry \n   3 - Quit");
        int option = sc.nextInt();

        if(option == 1) {
            System.out.println("Sorry, this feature is currrently under construction.");
        }

        else if(option == 2) {
            //ask for each value and scan
            System.out.println("\nPlease enter the information for the new entry");
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

        else if(option == 3) {
            return;
        }
    }
}
