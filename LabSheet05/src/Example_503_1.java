import javax.swing.*;
public class Example_503_1 {

	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence: ");
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence,again : ");
		}
		int spacebar = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spacebar +=1;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has"+spacebar+"space bar"+"\nThis sentence has "+(spacebar+1)+"word.");

	}

}
