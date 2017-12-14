/*|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*
 |                                                           |
 |                     Java Phone Book                       |
 |         Created by: Mason Timmerman and Max DeVos         |
 |                     December 2017                         |
 |                                                           |
 *|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/


package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) throws FileNotFoundException{

        //standard input object 1
        Scanner sc1 = new Scanner(System.in);

        //welcome and option menu
        System.out.println("\nWelcome to the Java Phone Book by Mason and Max!");
        System.out.println("\n  Enter what you would like to do with the corresponding number: ");
        System.out.print("   1 - Search \n   2 - Make a new entry \n   3 - Quit");
        int option = sc1.nextInt();

        if(option == 1) {
            //System.out.println("Sorry, this feature is currrently under construction.");
            SearchFile fileSearch = new FileSearch();
            fileSearch.parseFile("data.txt", "d");
        }

        else if(option == 2) {

            //standard input objects
            Scanner sc2 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);
            Scanner sc4 = new Scanner(System.in);
            Scanner sc5 = new Scanner(System.in);
            Scanner sc6 = new Scanner(System.in);

            do{
                //ask for each value and scan
                System.out.println("\nPlease enter the information for the new entry");

                System.out.print("  First Name: ");
                String firstName = sc2.nextLine();

                System.out.print("  Middle Initial: ");
                String middleInitial = sc3.nextLine();

                System.out.print("  Last Name: ");
                String lastName = sc4.nextLine();

                System.out.print("  Age: ");
                int age = sc5.nextInt();

                System.out.print("  Phone Number: ");
                long phoneNumber = sc6.nextLong();

                //send the values read to NewEntry and createFile classes
                NewEntry person = new NewEntry(firstName, middleInitial, lastName, age, phoneNumber);
                createFile g = new createFile(firstName, middleInitial, lastName, age, phoneNumber);

                //option to continue when entry is complete
                System.out.print("\nWould you like to make another entry?");
                System.out.print("\n  1 - No \n  2 - Yes ");
                option = sc1.nextInt();

            }while(option == 2);

            System.out.println("Thank you for your entry.");

        }

        //quit option selected
        else if(option == 3) {
            return;
        }

        //invalid input
        else {
            System.out.println("Invalid input. Restart program and try again.");
        }
    }
}
