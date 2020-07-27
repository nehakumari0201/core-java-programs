import java.util.Scanner;
public class Operation {

	public static void main(String[] args) {
		Scanner Keyboard=new Scanner(System.in);
		int firstNo,secondNo;
		char opr;
		double result=0.00;
		System.out.println("First number:-");
		firstNo=Keyboard.nextInt();
		System.out.println("Second number:-");
		secondNo=Keyboard.nextInt();
		System.out.println("Operation");
		opr=Keyboard.findWithinHorizon(".",0).charAt(0);
		switch(opr) {
		case '+': result= firstNo + secondNo;
		break;
		case '-':result= firstNo-secondNo;
		break;
		case '*':result=firstNo*secondNo;
		break;
		case '/':result=firstNo/secondNo;
		break;
		}
System.out.print(firstNo);
System.out.print( opr);
System.out.print( secondNo);
System.out.print("=");
System.out.print(result);
Keyboard.close();

	}

}
