import java.util.Scanner;
import java.lang.Math;

public class Interest {
	static Scanner sc=new Scanner(System.in);
	static final double RATE_OF_INTEREST=9.5;
	static int choice;
	
	public static void main(String[] args) {
		Interest i=new Interest();
	    do {
		System.out.println("Please enter your choice:");
		System.out.println("1)Simple Interest /n 2)Compound Interest /n 3)Exit");
		choice=sc.nextInt();
	    
	    switch(choice)
	    {
	    case 1:System.out.println(i.simpleInterest());
	    		break;
	    case 2:System.out.println(i.compoundInterest());
	    		break;
	    case 3 : System.out.println("Exiting....");
	    		break;
	    default:System.out.println("Ivalid input");
	    }
	    }while(choice<3);
	}

	public double compoundInterest()
	{
		System.out.println("Enter the principal amount");
		double principal=sc.nextDouble();
		//sc.close();
		System.out.println("Enter the number of years");
		double period=sc.nextDouble();
		//sc.close();
		double cmpInterest=principal+(Math.pow((1+RATE_OF_INTEREST/100), period));
		return cmpInterest;
	}
	
	public double simpleInterest()
	{
		System.out.println("Enter the principal amount");
		double principal=sc.nextDouble();
		//sc.close();
	    System.out.println("Enter the number of years");
		double period=sc.nextDouble();
		//sc.close();
		double smpInterest=principal+(principal*RATE_OF_INTEREST*period)/100;
		return smpInterest;
	}
}
