package myFristJava;
import java.util.Scanner;

public class AcceptInput {

	public static void main(String[] args) {
		// creates an object of Scanner
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter your name: ");

	    // takes input from the keyboard
	    String name = input.nextLine();
	    
	    
	    System.out.print("Enter your age: ");

	    // takes input from the keyboard
	    int age =input.nextInt();
	    // prints the name
	    System.out.println("My name is " + name + " and  age is "+ age);

	    // closes the scanner
	    input.close();
	    }

}
