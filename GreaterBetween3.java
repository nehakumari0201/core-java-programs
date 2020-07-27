import java.util.Scanner;
public class GreaterBetween3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a,b,c;
		 System.out.println("Enter any three number.");
		 a=input.nextInt();
		 b=input.nextInt();
		 c=input.nextInt();
		 if(a>=c) {
			 if(a>=b)
				 System.out.println("a is greater no."+a);
			 else
				 System.out.println("b is greater no"+b);
		 }
		 else
		 {
			 if(c>=b)
				 System.out.println("c is greater ."+c);
			 else
				 System.out.println("b is greater ."+b);
		 }
		 input.close();

	}

}
