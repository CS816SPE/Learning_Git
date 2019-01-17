import java.util.Scanner;
public class Calculator
{	public static void main(String args[])
	{


	float a,b,res;
	char choice,ch;
	Scanner scan=new Scanner(System.in);
	do{	System.out.println("1.Perform Subtraction");
		System.out.println("2.Perform Addition");
		System.out.println("3.Exit");
		System.out.println("Enter your choice: ");
		choice=scan.next().charAt(0);
		switch(choice)
		{	case '1': System.out.println("Enter two numbers: ");
					a=scan.nextFloat();
					b=scan.nextFloat();
					Subtract s =new Subtract(a,b);
					s.getRes();
					break;
			case '2': System.out.println("Enter two numbers: ");
					a=scan.nextFloat();
					b=scan.nextFloat();
					res=a+b;
					System.out.println("The result of addition is:" +res);
					break;

			case '3':System.out.println("Exiting!!!");
					System.exit(0);
					break;

			default:System.out.println("Entered wrong choice!!!");
					break;
		}
	}while(choice!='3');
	}
	
}
