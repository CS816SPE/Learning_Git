import java,util.Scanner;
	public class caladd {
		public static vid main(String args[]){
			float a, b, res;
			char choice, ch;
			Scanner scan = new Scanner(System.in);
		
			do {
				System.out.print("1.ADD TWO Numbers\n");
				System.out.print("2.EXIT\n\n");
				System.out.print("Enter Your chice : ");
				choice = scan.next().charAt(0);
				switch(choice){
					case '1' : System.out.print("Enter Two number :")
				   		   a = scan.nextFloat();
				      		   b = scan.nextFloat();
				   		   res = a+b;
				   		   System.out.print("Result =" + res);
				   		   break;
				   
					case '2' : System.exit(0);
				   		   break;
				   	case '3' : System.out.print("Enter Two number :")
				   		   a = scan.nextFloat();
				      		   b = scan.nextFloat();
				   		   res = a-b;
				   		   System.out.print("Result =" - res);
				   		   break;
				   
					default : System.out.print("INVALID CHOICE !!!");
				   		  break;
				 
				}
		
				  System.out.print("\n--------------\n");
			
			}while(choice != 2);
		
		}
		
	
	}
	
