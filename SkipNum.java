import java.util.Scanner;
public class SkipNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=new int[50];
		int i,size;
		Scanner number=new Scanner(System.in);
		System.out.println("size of array ");
		size=number.nextInt();
		System.out.println("enter the element of array.");
		for(i=0;i<size;i++)
			nums[i]=number.nextInt();
		System.out.println("print array element after each skip.");
		for(i=0;i<size;i=i+2)
			System.out.println(nums[i]);
		
		
		
		

	}

}
