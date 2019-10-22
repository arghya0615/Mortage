import java.util.*;
public class Mortage {

	/**
	 * @param args
	 */
	public static int calculateTotalPayment(int b,int interest_percentage,int repayment_percentage)
	{	
		int initial_debt = b;
		int c=0,y,a;
		a=(repayment_percentage*initial_debt)/100;
		while(b > a)
		{
			 if(b>=50)
			 {
			b= b + (b * interest_percentage)/100 -a;
			c++;
		     }
			 else
				 break;
		}
		y= c*a + 50 + (10*initial_debt)/100 ;
		return y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int initial_debt, interest_percentage, repayment_percentage,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("initialLevelOfDebt =");
		initial_debt= sc.nextInt();
		System.out.print("interestPercentage =");
		interest_percentage= sc.nextInt();
		System.out.print("repaymentPercentage =");
		repayment_percentage= sc.nextInt();
		
		y= calculateTotalPayment(initial_debt,interest_percentage,repayment_percentage);
		System.out.print("Output:");
		System.out.println(y);
	}	
}		
		
	


