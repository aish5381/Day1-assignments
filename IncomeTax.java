import java.util.Scanner;
public class IncomeTax {
	public static Scanner scanner=new Scanner(System.in);
	public static double salary;
	public static void main(String[] args)
	{
		IncomeTax incometax=new IncomeTax();
		System.out.println("Please enter the salary to calculate income tax");
		salary=scanner.nextDouble();
		incometax.calculateTax(salary);
	}
	public void calculateTax(double income)
	{
		if(income>=0 && income<=180000)
		{
			System.out.println("No Income Tax to be paid in Range(0-1,80,000)");
		}
		
		else if(income>=181001 && income<=300000)
		{
			System.out.println("Your income Tax to be paid in Range(1,81,001-3,00,000) is Rs."+salary*0.01);
		}
		else if(income>=300001 && income<=500000)
		{
			System.out.println("Your income Tax to be paid in Range(3,00,001-5,00,000) is Rs."+salary*0.02);
		}
		else if(income>=500001 && income<=1000000)
		{
			System.out.println("Your income Tax to be paid in Range(5,00,001-10,00,000) is Rs."+salary*0.03);
		}
		else
		{
			System.out.println("Enter amount less than 100000");
		}
	}
}
