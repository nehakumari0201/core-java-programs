import java.util.Scanner;
public class FirstAttemp {

	public static void main(String[] args) {
		Scanner Keyboard=new Scanner(System.in);
		char sybmol=' ';
		System.out.println("Enter the any charater:-");
		sybmol=Keyboard.findWithinHorizon(".", 0).charAt(0);
		while(sybmol!='@') {
			System.out.println(sybmol);
			System.out.println("Enter the any charater:-");
			sybmol=Keyboard.findWithinHorizon(".", 0).charAt(0);
		
		}
		System.out.println();
		Keyboard.close();
		

	}

}
