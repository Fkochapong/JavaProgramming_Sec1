import java.text.DecimalFormat;
import java.util.*;
public class PensionContributionCalculator {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("####.00");
		Scanner scan = new Scanner(System.in);
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_55_AND_BELOW = 0.2;
		final double EMPLOYER_55_AND_BELOW = 0.17;
		final double EMPLOYEE_55_TO_60 = 0.13;
		final double EMPLOYER_55_TO_60 = 0.13;
		final double EMPLOYEE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		// Declare variables
		int salary,age; //to be input
		int contributableSaralary;
		double employeeContribution,employerContribution,totalContribution;
		System.out.print("Enter the monthly salary: ");
		salary = scan.nextInt();
		System.out.print("Enter the age: ");
		age = scan.nextInt();
		//Check the contribution cap
		contributableSaralary = Math.min(salary, SALARY_CEILING);
	    //Compute various contributions in "double" using a nested-if to handle 4 cases
		if (age <=55) {       //55 and below
			employeeContribution = contributableSaralary*EMPLOYEE_55_AND_BELOW;
			employerContribution = contributableSaralary*EMPLOYER_55_AND_BELOW;
		}else if (age <= 60) {//(60, 65]
			employeeContribution = contributableSaralary*EMPLOYEE_60_TO_65;
			employerContribution = contributableSaralary*EMPLOYER_RATE_60_TO_65;
		}else if (age <= 65) {//(55,60]
			employeeContribution = contributableSaralary*EMPLOYEE_55_TO_60;
			employerContribution = contributableSaralary*EMPLOYEE_55_TO_60;
		}else {               //above 65
			employeeContribution = contributableSaralary*EMPLOYEE_RATE_65_ABOVE;
			employerContribution = contributableSaralary*EMPLOYER_RATE_65_ABOVE;
		}
		
		totalContribution = employeeContribution + employerContribution;
		System.out.printf("The employee's contribution is:$"+frm.format(employeeContribution));
		System.out.printf("\nThe employer's contribution is: $"+frm.format(employerContribution));
		System.out.printf("\nThe total contribution is : $"+frm.format(totalContribution));

	}

}
