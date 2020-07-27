import java.util.Scanner;
public class WhichDayOfWeek {

	public static void main(String[] args) {
		Scanner Keyboard =new Scanner(System.in);
		int Day;
		System.out.println("Which day of week");
		Day=Keyboard.nextInt();
		switch(Day) {
		case 1:System.out.println(" sunday");
		break;
		case 2:System.out.println("monday ");
		break;
		case 3:System.out.println("Tuesday");
		break;
		case 4:System.out.println("WednesDay");
		break;
		case 5: System.out.println("thursdays");
		break;
		case 6:System.out.println("Friday");
		break;
		case 7:System.out.println("Saturday");
		break;
		}
Keyboard.close();
	}

}
