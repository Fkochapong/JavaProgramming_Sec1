import javax.swing.*; //input data from Dialog box
import java.text.*; //จัดรูปเเบบตัวเลข
public class Example1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFT = 299;
		//รับข้อมูลทาง Dialog box เเละเเปลงข้อมูลให้เป็นเลขจำนวนเต็ม
		int numberofCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill"));
		double discount,totalPrice=0;
		//calculate total price of buffet
		totalPrice= BUFFT * numberofCustomer;
		//using Confirm Dialog box
		int member;
		do {
			member = JOptionPane.showConfirmDialog(null, "Total price"
					+frm.format(totalPrice)+"Baht."
					+ "\nDo you have a member card ?");
		}while(member==JOptionPane.CANCEL_OPTION);
		if(member == JOptionPane.YES_OPTION) {
			//discount = totalPrice-(totalPrice*10/100);
			discount = totalPrice * 90/100;
			JOptionPane.showMessageDialog(null,
					"Amount to be paid is "+frm.format(discount) +"baht.");
		}//end if
		else if(member == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null,
					"Amount to be paid is "+frm.format(totalPrice)+"Baht.");
		}           

	}

}
