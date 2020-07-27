import java.util.Scanner;
public class SmileFace {

	public static void main(String[] args) {
       Scanner Keyboard=new Scanner(System.in); 
       char userInput;  
       System.out.println("You want to see the smile (y/n)");
       userInput = Keyboard.findWithinHorizon(".", 0).charAt(0);
       String display = (userInput == 'Y') ? ":-)": "-(";
       System.out.println(display);
       
    Keyboard.close();
	//}

	//private static String message1() {
	//	return ":-(";
		
	//}

	//private static String message() {
	//	return ":-)";
		
	}

}
