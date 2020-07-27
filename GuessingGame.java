import java.util.Scanner;
import java.util.Random;
public class GuessingGame {

	public static void main(String[] args) {
		Random myrandom=new Random();
		Scanner Keyboard=new Scanner(System.in);
		int randomnum=myrandom.nextInt(10)+1;
		int user_input=0;
		while(user_input!=randomnum) {
			System.out.println("you loss");
			System.out.println("guess the number");
			user_input=Keyboard.nextInt();
		}
		System.out.println("you win");

		Keyboard.close();
		

	}

}
