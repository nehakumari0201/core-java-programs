import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;
public class TheOldSwitcheroo {

	public static void main(String[] args) {
		Scanner Keyboard =new Scanner(System.in);
		Random myRandom = new Random();
		int randomNumber;
		out.println("Type your question my child");
		Keyboard.hasNextLine();
		randomNumber=myRandom.nextInt(10)+1;
		switch(randomNumber) {
		case 1:
			out.println("Yes, Isn't it obvious");
			break;
		case 2:
			out.println("No, and don't ask again");
			break;
		case 3:
			out.println("Yessir ,yessir!");
			out.println("Three bags full.");
			break;
		case 4:
			out.println("What part of 'no' don't you understand");
			break;
		case 5:
			out.println("No chance ,lance");
			break;
		case 6:
			out.println("Sure ,whatever");
			break;
		case 7:
			out.println("yes ,but only ifyou're nice to me.");
			break;
		case 8:
			out.println("Yes(as if I care).");
			break;
		case 9:
			out.println("No,not until cromwell seizes Dover.");
			break;
		case 10:
			out.println("No,not until Nell squeezes Rover");
			break;
		default:
			out.print("you thnk you have problem?");
			out.print("My random Number generator is broken");
			break;
		}
		out.println("Goodbye");
		Keyboard.close();

	}

}
