import java.util.Scanner;
import java.util.Random;
class RandomNum
{
public static void main(String[] args)
	{
		Scanner Keyboard=new Scanner(System.in);
		Random  myRandom=new Random();
		int randomNumber; int num;
		//String display;
		randomNumber=myRandom.nextInt(10)+1;
		System.out.println("Enter any number of your choice");
		num=Keyboard.nextInt();
		 String display=randomNumber==num?"You win!":"You loss";
		 System.out.println("Random Number:-" +randomNumber);
		 System.out.println(display);
		Keyboard.close();
	}

}
