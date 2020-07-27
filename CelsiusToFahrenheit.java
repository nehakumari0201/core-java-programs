import java.util.Scanner;
public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner Keyboard=new Scanner(System.in);
		Double celsius ,fahrenheit;
		System.out.print("Enter the Celsius temperture:");
		celsius=Keyboard.nextDouble();
		fahrenheit=9.0/5.0*celsius+32.0;
		System.out.print("fahrenheit: ");
		System.out.print(fahrenheit);
		System.out.print("Room temperature?");
		System.out.println(fahrenheit==69.8);
		Keyboard.close();
	

	}

}
