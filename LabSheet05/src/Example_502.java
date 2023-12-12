import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		//1.input email address
		String yourEmail = JOptionPane.showInputDialog("Input your e-mail: ");
		//2.check email that correct or not
		while(yourEmail.startsWith("@")||yourEmail.startsWith("")) {
			yourEmail = JOptionPane.showInputDialog("Input your e-mail,again :");
		}
		//3.check email that is hotmail or gmail.com or not
		yourEmail=yourEmail.toLowerCase();
		if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is"+yourEmail);
		}else {
			JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or"+"gmail dot com");
		}

	}

}
