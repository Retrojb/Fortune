
import java.util.Scanner;
public class FourtuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.println("Welcome to John's Miracle Fortune Teller \n "
			+ "You will be asked a series of questions and "
			+ "based on your input \n your fortune will be told");
		System.out.println(" ");
		System.out.println("Please enter your First Name: ");
	
	String firstName = input.nextLine();
	
		System.out.println(" ");
		System.out.println("Please enter your Last Name: ");
	
	String lastName = input.nextLine();
		System.out.println(" ");
		System.out.println(" Hello, " + firstName + " " + lastName + " , how old are you?");
		
	int age = input.nextInt();
		if (age < 40) {
			System.out.println("Wow, " + age + " you are so young");
		} else {
			System.out.println(age + "its just a number, you are still young at heart");
		}
	System.out.println(" ");
		System.out.println("Okay " + firstName + " what month were you born in? "
			+ "Please enter a numerical value (i.e July = 7)");
	
	

	}

}
