import java.util.Random;
import java.util.Scanner;
public class Lucky {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		Random myRandom = new Random();
		int randomNumber = myRandom.nextInt(10)+1;
		System.out.println("Enter a number");
		int num=Keyboard.nextInt();
		if (randomNumber == num) {
			System.out.println("You win");
		}else
		{
			System.out.println("You loss");
		}
Keyboard.close();
	}

}
