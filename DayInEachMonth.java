import java .util.Scanner;
public class DayInEachMonth {

	public static void main(String[] args) {
		Scanner Keyboard =new Scanner(System.in);
		int month ;
		int numberOfDays=0;
		boolean isLeapYear;
		System.out.println("Which month?");
		month =Keyboard.nextInt();
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numberOfDays=31;
		break;
		case 4:
		case 6:
		case 9:
		case 11:numberOfDays=30;
			break;
		case 2:
			System.out.println("Leap year(true/false)?");
			isLeapYear=Keyboard.nextBoolean();
			if(isLeapYear) {
				numberOfDays=29;
			}else {
				numberOfDays=28;
			}	
		}
System.out.print(numberOfDays);
System.out.println(" days");
Keyboard.close();
	}

}
