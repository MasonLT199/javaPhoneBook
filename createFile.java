
import java.io.*;
import java.lang.*;
import java.util.*;
//import java.lang.Object;

public class createFile {

	//private Formatter x;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private int age;
	private long phoneNum;

	public createFile(String fName, String mName, String lName, int nAge, long pNum){
		firstName = fName;
		middleInitial = mName;
		lastName = lName;
		age = nAge;
		phoneNum = pNum;
		writeUsingFileWriter();
	}

	private static void writeUsingFileWriter() {

        File file = new File("./data.txt");

        FileWriter fr = null;

        try {

            fr = new FileWriter(file);
            fr.write("%s %s %s %d %d",firstName,middleInitial,lastName,age,phoneNum);

        } catch (IOException e) {

            e.printStackTrace();

        }finally{

            //close resources
            try {

                fr.close();

            } catch (IOException e) {

                e.printStackTrace();

            }
        }
    }
