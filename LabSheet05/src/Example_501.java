import java.util.*;

public class Example_501 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word,sentence="";
		while(true) {
			System.out.print("Enter word: ");
			word=input.next();
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			sentence = sentence + word+" ";
		}
		System.out.println(sentence.toUpperCase());

	}

}
