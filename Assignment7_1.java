package ASSIGNMENTS;
//Write a program to convert an int variable to String using an inbuilt function of String class.
public class Assignment7_1 {
	public static void main(String args[]) {
		// Define a integer variable
		int number = -1854;
		System.out.println("The Integer before conversion is:"+number);
		
		// Convert the integer variable to string using the inbuilt 'valueof'
		// function of the string class
		String numberAsString = String.valueOf(number);
		
		//Print the converted string
		System.out.println("Converted string is : "+numberAsString);

		//Perform some operations on the converted string.
		System.out.println("First character of the string is: "+numberAsString.charAt(0));
		System.out.println("Length of the string is: "+numberAsString.length());
	}
}
