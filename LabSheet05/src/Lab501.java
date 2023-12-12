import java.util.*;

public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		int space = fullName.trim().indexOf(" ");
		if(fullName.indexOf(' ')==-1) {
			System.out.println("Incorrect Name");
		}
		String firstName = fullName.substring(0,fullName.indexOf(' '));
		String lastName = fullName.substring((fullName.indexOf(' ')+1));
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
	}

}
