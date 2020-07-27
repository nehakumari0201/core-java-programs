import java.util.Scanner;
public class AddNumber {

	public static void main(String[] args) {
		Scanner Keyboard=new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.print("Enter the numbers.");
		a = Keyboard.nextInt();
		b=Keyboard.nextInt();
		c=a+b;
		System.out.print("Sum of two no ");
		System.out.println(c);
		Keyboard.close();
	
		

	}

}
