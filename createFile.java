
import java.io.*;
import java.lang.*;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
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

	private void writeUsingFileWriter() {

        File file = new File("./data.txt");

		// if (!file.exists()) {
        //     file.createNewFile();
        // }

        StringBuilder data = new StringBuilder();
        data.append(firstName);
        data.append(" ");
        data.append(middleInitial);
        data.append(" ");
        data.append(lastName);
        data.append(" ");
        data.append(age);
        data.append(" ");
        data.append(phoneNum);

		data.toString();

        try {

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data.toString() + "\n");
			bw.close();

        } catch (IOException e) {

            e.printStackTrace();

        }
		System.out.println(data.toString());//finally{

            //close resources
            //try {

                //fr.close();

            //} catch (IOException e) {

            //e.printStackTrace();

            //}
        //}
    }
}
