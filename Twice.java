import java.util.Scanner;
public class Twice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);
		int prev = key.nextInt();
	//	
		while(true) {
			int number =key.nextInt();
			
			
			if (number == prev) 
			{
			System.out.println("done");
				break;
			}
			else {
				prev = number;
			}
		}
		key.close();

	}

}
