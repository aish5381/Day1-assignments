import java.util.Scanner;

public class Report {
	public static int eng;
	public static int maths;
	public static int science;
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the marks of three subjects");
		System.out.println("Enter marks for English");
		eng=scanner.nextInt();
		System.out.println("Enter marks for Maths");
		maths=scanner.nextInt();
		System.out.println("Enter marks for Science");
		science=scanner.nextInt();
		
		Report report=new Report();
		report.result(eng, maths, science);
	}
	
	public void result(int subject1,int subject2,int subject3)
	{
		if(subject1>60 && subject2>60 && subject3>60)
		{
			System.out.println("Congratulations!! You are passed");
		}
		else if((subject1>60 && subject2>60)||(subject2>60 && subject3>60)||(subject1>60 && subject3>60))
		{
			System.out.println("Congratulations!!! You are promoted");
		}
		else if((subject1>60 || subject2>60 || subject3>60)||(subject1<60 && subject2<60 && subject3<60))
		{
			System.out.println("Sorry!! You have failed");
		}
		
		else
		{
			System.out.println("You have failed!!");
		}
	}
}
