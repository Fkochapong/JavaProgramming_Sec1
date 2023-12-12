import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		String msg = message.toLowerCase();
		
		String text="";
		int countWord=0;
		if(msg.indexOf("nichi")>=0) {
			countWord++;
		}
		if(countWord==0) {
			System.out.print(message);
		}else {
			System.out.print("Nichi is a sentence");
		}

	}

}
