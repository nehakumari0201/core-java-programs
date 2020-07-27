import java.util.Scanner;
class ParkingCar {
	public static void main(String[] args) {
	Scanner Keyboard = new Scanner(System.in);
	double postedPrice;
	double tips;
	double total;
	tips=2;
	System.out.print("What is the garage's posted price for parking your car");
     postedPrice =Keyboard.nextDouble();
     total=postedPrice+tips;
     System.out.print("you will pay $");
     System.out.print(total);
     System.out.println("after adding $2 tip.");
     Keyboard.close();
		

	}

}
