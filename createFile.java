
import java.io.*;
import java.lang*;
import java.util*;

public class createFile {

	private Formatter x;
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
	}

	public void openFile(){
		try{
			x = new Formatter("text.txt");
		}catch(exception e){
			System.out.println("you have an error");
		}
	}

	public void addRecords(){
		x.format("

			%s
			%s
			%s
			%d
			%l

			", firstName, middleInitial,lastName , age, phoneNum);
	}

	public void closeFile(){
		x.close();
	}

}