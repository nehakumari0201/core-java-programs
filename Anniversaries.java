import java.util.Scanner;
public class Anniversaries {
	public static void main(String[] args) {
		Scanner Keyboard=new Scanner(System.in);
		int year;
		int annivery;
		System.out.println("My wife and i were married on February 29");
		System.out.print("value of year =");
		year=Keyboard.nextInt();
		annivery=year/4;
		System.out.print("no of anniversaries=");
		System.out.print(annivery);
		Keyboard.close();
	}
}
