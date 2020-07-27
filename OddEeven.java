import java.util.Scanner;

public class OddEeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter any  no.");
		a=input.nextInt();
		if(a%2==0)
			System.out.println(" Number is even");
		else
			System.out.println("Number is odd.");
		input.close();
			


	}

}
