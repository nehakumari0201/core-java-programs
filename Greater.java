import java.util.Scanner;
public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter any two no.");
		a=input.nextInt();
		b=input.nextInt();
		if(a>=b)
			System.out.println(" a is greater no.");
		else
			System.out.println("b is greater no.");
		input.close();
			

	}

}
