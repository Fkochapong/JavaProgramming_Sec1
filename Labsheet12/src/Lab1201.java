import java.util.*;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args) throws IOException{
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(readFile.hasNext()) {
			String fname = readFile.next(); //read name from file
			String lname = readFile.next(); //read surname from file
			readFile.next(); //read password from file
			String email = readFile.next().toUpperCase(); //read email from file
			System.out.println(lname.substring(0,1)+"."+fname+" "+"("+email+")");
		}
		//close file
		readFile.close();
	}

}