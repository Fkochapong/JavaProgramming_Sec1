import java.util.*;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException{
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(readFile.hasNext()) {
			String fname = readFile.next(); //read name from file
			//String lname = readFile.next(); //read surname from file
			readFile.next(); //read surname from file
			readFile.next(); //read password from file
			String email = readFile.next().toUpperCase(); //read email from file
			System.out.println(fname+" "+"("+email+")");
		}
		//close file
		readFile.close();
	}

}
