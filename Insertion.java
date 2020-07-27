import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = new int [5];
		int i;
		Scanner  scan =new Scanner(System.in);
		System.out.println("Enterthe array element .");
		for(i=0;i<5;i++) 
			num[i]=scan.nextInt();
		
System.out.println("print the array element .");
for(i=0;i<5;i++)
	System.out.println(num[i]);

	}

}
