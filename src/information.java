import java.util.Scanner;

public class information {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**

		 *

		 * Name: h

		 * Teacher: Mr.Hardman

		 * Assignment 3, Program 2

		 * Date Last Modified:10/31/2016

		 *

		 */
		Scanner userInput = new Scanner(System.in);
		String Firstname;
		String Lastname;
		String StudentID;
		String School;
		int Grade;
		
		System.out.println("Hello user!");
		
		System.out.print("What is your Fist name?");
		Firstname=userInput.nextLine();
		
		System.out.print("What is your last name?");
		Lastname=userInput.next();
		
		System.out.print("What is your Grade?");
		Grade=userInput.nextInt();
		
		System.out.print("What is your Student ID?");
		StudentID=userInput.next();
		
		System.out.print("What is your School Average?");
		School=userInput.next();
		
		System.out.print("Do you want Lgoin?  Yes/No:");
		userInput.next();
		
		System.out.println("\n"+"Your information:");
		System.out.println(String.format("      Login:%15s",Lastname+Firstname+StudentID));
		System.out.println(String.format("      ID:%12s",StudentID));
		System.out.println(String.format("      Name:%10s",Firstname+Lastname));
		System.out.println(String.format("      Average:%4.5s",School));
		System.out.println(String.format("      Grade:%6s",Grade));
		
		userInput.close();
	}

}
