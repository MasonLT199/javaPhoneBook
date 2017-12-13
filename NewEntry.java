//new Entry Class

public class NewEntry{

	private String firstName;
	private String middleInitial;
	private String lastName;
	private int age;
	private long phoneNum;

	public NewEntry(String fName, String mName, String lName, int nAge, long pNum){
		firstName = fName;
		middleInitial = mName;
		lastName = lName;
		age = nAge;
		phoneNum = pNum;

		printAdditions();
		saveEntry();
	}

	private void printAdditions(){
		System.out.println("\nNew Entry Contents:");
		System.out.println("First Name: " + firstName);
		System.out.println("Middle Initial: " +  middleInitial);
		System.out.println("Last Name: " +  lastName);
		System.out.println("Age: " +  age);
		System.out.println("Phone Number: " + phoneNum + "\n");
	}

	private void saveEntry(){

		String EntryInfo = "

		";



	}


}
