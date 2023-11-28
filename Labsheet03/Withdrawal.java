import javax.swing.*;
import java.util.*;
import java.text.*;

public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		
		int withdrawMoney=Integer.parseInt(
				JOptionPane.showInputDialog("Your balance : "+frm.format(balance)+"\nInput money to withdraw: "));
		//if/elseif for check condition
		if(withdrawMoney>20000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000");
		}
		else if(withdrawMoney>balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance");
		}
		else if(withdrawMoney%100!=0) {
			JOptionPane.showMessageDialog(null, "Error: cannot withdraw ");
		}
	    int withDraw;
	    withDraw= withdrawMoney;
	    JOptionPane.showMessageDialog(null, "You withdraw "+frm.format(withDraw)+"baht."
	    		+"\n1,000");

	}

}
