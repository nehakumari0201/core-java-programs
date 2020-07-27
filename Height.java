import java.util.Scanner;
public class Height {

	public static void main(String[] args) {
		Scanner Keyboard= new Scanner(System.in);
		double h;
		double heightInch;
		System.out.print("Enter the height of person in feet=");
		h=Keyboard.nextDouble();
		heightInch=h*12;
		System.out.println(" height in inches ="+heightInch);
		Keyboard.close();
		

	}

}
