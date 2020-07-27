import java.util.Scanner;
public class Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int arr[]=new int[25];
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the element of array.");
		for(i=0;i<25;i++)
			arr[i]=num.nextInt();
		System.out.println("Enter any number between 1 to 5");
		 int n= num.nextInt();
		 for(i=0;i<25;i=i+n)
			 System.out.println(arr[i]);
			 
		 
		

	}

}
