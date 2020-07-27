import java.util.Scanner;
public class ThereYet {

	public static void main(String[] args) {
		Scanner Keyboard=new Scanner(System.in);
		char user_input;
		//System.out.println("Are we there yet?");
		user_input=Keyboard.findWithinHorizon(".", 0).charAt(0);
		while(user_input!='Y'&&user_input!='y')
		{
			System.out.println("Are we there yet?");
			user_input=Keyboard.findWithinHorizon(".", 0).charAt(0);
		}
System.out.println("whew!");
Keyboard.close();
	}

}
