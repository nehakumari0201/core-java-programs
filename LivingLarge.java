import java.util.Scanner;
public class LivingLarge {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int number;
		System.out.print("Enter the any number:-");
		number=keyboard.nextInt();
		while(number<=100)
		{
			System.out.println(number);
			System.out.print("Enter the any number:-");
			number=keyboard.nextInt();
		}
		keyboard.close();

	}

}
