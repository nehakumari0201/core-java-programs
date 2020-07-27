import java.util.Scanner;
import java.util.Random;

public class AnswerYesOrno {

	public static void main(String[] args) {
		Scanner Keyboard =new Scanner(System.in);
		Random myRandom = new Random();
		int randomNumber;
	
		System.out.print("Type your Question,my child");
		 Keyboard.nextLine();
		//System.out.println(c);
		randomNumber=myRandom.nextInt(10)+1;
		System.out.println(randomNumber);
		if(randomNumber>5) {
			System.out.println("Yes, isn't obvious?");
		}else {
			System.out.println("No,and don't ask again.");
		}
		Keyboard.close();

	}

}
