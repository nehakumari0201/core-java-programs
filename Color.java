import java.util.Scanner;
public class Color {

	public static void main(String[] args) {
		Scanner Keyboard=new Scanner(System.in);
		int colorNo;
		System.out.println("Enter the number of color");
		colorNo=Keyboard.nextInt();
		switch(colorNo) {
		case 0: System.out.println("black");
		break;
		case 1:System.out.println("blue");
		break;
		case 2:System.out.println("green");
		break;
		case 3:System.out.println("cyan");
		break;
		case 4:System.out.println("red");
		break;
		case 5:System.out.println("magenta");
		break;
		case 6:System.out.println("yellow");
		break;
		case 7:System.out.println("white");
		break;
		}
Keyboard.close();
	}

}
