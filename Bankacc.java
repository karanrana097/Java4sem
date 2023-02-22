package bankacc;
import java.util.*;
public class Bankacc {

	public static void main(String[] args) 
	{
		/*Using switch statement write a menu driven program to calculate the maturity amount of a bank deposit.
		 * The user is given following options.
		 * Term deposit and Recurring deposit.
		 * 1> accept Principal (P) Rate (R) and Time period (N) and compute the maturity amount a by the formula 
		 * a = p[1+r/100]n 
		 * 2> accept monthly installment p2 r2 and time period n2 in months cal the output a2 maturity amout 
		 * by the formula 
		 * a2=p2*n2+p2*n2(n2+1)/2*r2/100*1/12.
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Term Deposit.\n2. Recurring Deposit.");
		System.out.println("Enter your Choice: ");
		int c=sc.nextInt();
		switch(c) 
		{
			case 1:
				System.out.print("Enter Principal amount: ");
				int p=sc.nextInt();
				System.out.print("Enter ROI: ");
				int r=sc.nextInt();
				System.out.print("Enter Time Period in years: ");
				int n=sc.nextInt();
				float a = p*(1+r/100)*n;
				System.out.print("Maturity Amount: "+a);
				break;
			case 2:
				System.out.print("Enter Principal amount: ");
				int p2=sc.nextInt();
				System.out.print("Enter ROI: ");
				int r2=sc.nextInt();
				System.out.print("Enter Time Period in Months: ");
				int n2=sc.nextInt();
				float a2 = p2*n2+(p2*n2*(n2+1))/2*(r2/100)*(1/12);
				System.out.print("Maturity Amount: "+a2);
				break;			
		}
		

	}

}
