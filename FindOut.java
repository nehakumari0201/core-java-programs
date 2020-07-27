import java.util.Scanner;
public class FindOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		int i,n;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the element of array.");
		for(i=0;i<10;i++)
			arr[i]=num.nextInt();
		System.out.println("enter a num u what to find in array");
		n=num.nextInt();
		for(i=0;i<10;i++)
			if(arr[i]==n)
				System.out.println("value found "+arr[i]);
			else
				System.out.println("value not found");
		

	}

}
