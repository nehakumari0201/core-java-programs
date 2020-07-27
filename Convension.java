import java.util.Scanner;
public class Convension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
	     double	temp;
	     int choice ;
	     System.out.println("Enter the temperture.");
	     temp=input.nextInt();
	     System.out.println(" 1. Fahrenheit to celsius.");
	     System.out.println(" 2. celsius to Fahrenheit.");
		System.out.println("Enter your choice.");
		choice=input.nextInt();
		if(choice==1) {
			double c= (temp-32)/1.8;
			 System.out.println(c);
		}else if(choice==2) {
			double f=temp*9/5+32;
			 System.out.println(f);
		}
		else {
			 System.out.println("invalid choice");

		}
	
		input.close();
	}

}
