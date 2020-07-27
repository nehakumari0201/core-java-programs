import java.util.Scanner;
public class TallyUp {

	public static void main(String[] args) {
		Scanner Keyboard=new Scanner(System.in);
		int User_input,sum=0;
		System.out.println("Enter any number:-");
		User_input=Keyboard.nextInt();
		while(User_input>=0) {
			System.out.println(User_input);
			System.out.println("Enter any number:-");
			User_input=Keyboard.nextInt();
			sum +=User_input;
		}
System.out.println("total sum of number"+sum);
Keyboard.close();
	}

}
