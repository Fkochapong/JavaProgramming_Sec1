import java.util.Scanner;
import java.io.*;
public class Example1202 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);//input data from keyboard(console)
		System.out.print("Input Section:");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);

	}
	
	public static void showListStudent(int section) throws IOException{
		//Read data from file using BufferedReader class
		BufferedReader readFile = new BufferedReader(new FileReader("d://textFile//List107.txt")); 
		String tmp = "";
		while((tmp= readFile.readLine())!=null) {
			String[]data = tmp.split("\t");
			//read midterm and final score from file to display
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			int section1 = Integer.parseInt(data[3]);
			
			if(section1==section) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtermScore
						+"\t"+finalScore+findResult(midtermScore,finalScore));
			}
		}
	}
	
	public static String findResult(double midtermscore,double finalscore) {
		double totalScore = midtermscore+finalscore;
		/*if(totalScore<=40) return "Fail";
		 else return "Pass";*/
		return totalScore<=40?"Fail":"Pass";
		
	}
	
	public static void Header(int sec) {
		System.out.println("*********************************");
		System.out.println("\t\t\tList of Data for Section"+ sec);
		System.out.println("*********************************");
	}
}//end class
