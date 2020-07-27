import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter any year.");
		a=input.nextInt();
		if(a%4==0)
			System.out.println(" leap year");
		else
			System.out.println("not leap year.");
		input.close();
			


	}

}
