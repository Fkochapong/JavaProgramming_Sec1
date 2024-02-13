import java.io.*;
import java.util.Scanner;
public class SaveandOpen extends Employee {
	private String name;
	private String dept;
	
	public void insert()throws IOException{
		//create object for input data from keyboard(console)
		Scanner input = new Scanner(System.in);
		String answer;
		do {
			header();//call hearer() method from Employee Class
			System.out.print("Enter name:");
			name = input.next();
			System.out.print("Enter department :");
			dept = input.next();
			//save all data to file employee.txt
			System.out.print("Enter data again? :");
			answer = input.next();
		}while(answer.equalsIgnoreCase("y"));
				
		//create object for write data to file
		PrintStream writeFile = new PrintStream(new File("d://txtFile//employee.txt"));
		writeFile.println(name+"\t"+dept);
		
		writeFile.close();
	}
	public void read() {
		try {
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(name);
					check = true;
				}
			}
			if(check==false) {
				System.out.print("\nSorry,no department: "+super.getDept()+"in file.");
			}
		}catch(IOException e) {
			System.out.println("Sorry, file not found");
		}
	}

}
