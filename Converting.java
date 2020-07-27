import java.util.Scanner;
public class Converting {

	public static void main(String[] args) {
		Scanner Keyboard =new Scanner(System.in);
		int lenght;
		int len;
		char choice;
		System.out.println("Enter the lenght in meter");
		lenght=Keyboard.nextInt();
		len=lenght*100;
		System.out.println("In which form show the lenght");
		Scanner input=new Scanner(System.in);
		choice=input.findWithinHorizon(".", 0).charAt(0);
		if(choice == 'C') {
			System.out.println(len);
		}
		else {
			System.out.println(lenght);
		}
Keyboard.close();
input.close();
	}

}
