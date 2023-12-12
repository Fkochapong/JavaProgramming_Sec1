import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1.input sentence
		System.out.print("Input a sentence: ");
		String sentence = scan.nextLine();
		//2.check sentence end of . or not
		while(sentence.endsWith(".")) {
			System.out.print("Input a sentence,agian: ");
			sentence = scan.nextLine();
		}
		System.out.println();
		//3.loop for check space bar
		int spacebar = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spacebar +=1;
			}
		}
		System.out.println("This sentence has "+ spacebar+" spacebar.");
		System.out.print("This sentence has"+(spacebar+1)+"word.");
	}

}
