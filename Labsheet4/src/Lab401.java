import java.util.Scanner;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of X : ");
		int x = scan.nextInt();
		System.out.print("Input value of Y : ");
		int y = scan.nextInt();
		if (y<x) {
			do {
				System.out.print("Input value of Y ,again : ");
				y = scan.nextInt();
			}while (y<x);
		}
		int valuex = x;
		int sum = 0;
		int valuey;
		System.out.println();
		for (int i = x; i<y;i++) {
			
			valuey = i+1;
			sum = valuex + valuey;
			System.out.println(valuex + " + " + valuey + " = " + sum);
			valuex = sum ;
		}
		

	}

}
