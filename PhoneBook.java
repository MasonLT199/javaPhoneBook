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

        //standard input object 1
        Scanner sc1 = new Scanner(System.in);

        //welcome and option menu
        System.out.println("\nWelcome to the Java Phone Book by Mason and Max!");
        System.out.println("\n  Enter what you would like to do with the corresponding number: ");
        System.out.print("   1 - Search \n   2 - Make a new entry \n   3 - Quit");
        int option = sc1.nextInt();

        if(option == 1) {
            System.out.println("Sorry, this feature is currrently under construction.");
        }

        else if(option == 2) {

            //standard input object
            Scanner sc = new Scanner(System.in);

            do{
                //ask for each value and scan
                System.out.println("\nPlease enter the information for the new entry");

                System.out.print("  First Name: ");
                String firstName = sc.nextLine();

                System.out.print("  Middle Initial: ");
                String middleInitial = sc.nextLine();

                System.out.print("  Last Name: ");
                String lastName = sc.nextLine();

                System.out.print("  Age: ");
                int age = sc.nextInt();

                System.out.print("  Phone Number: ");
                long phoneNumber = sc.nextLong();

                //send the values read to NewEntry and createFile classes
                NewEntry person = new NewEntry(firstName, middleInitial, lastName, age, phoneNumber);
                createFile g = new createFile(firstName, middleInitial, lastName, age, phoneNumber);
                g.openFile();
                g.addRecords();
                g.closeFile();

                //option to continue when entry is complete
                System.out.print("\nWould you like to continue?");
                System.out.print("2 - Continue");
                option = sc1.nextInt();
            }while(option == 2);

        }

        else if(option == 3) {
            return;
        }

        else {
            System.out.println("Invalid input. Restart program and try again.");
        }
    }
}
