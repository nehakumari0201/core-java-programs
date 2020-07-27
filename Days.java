import java.util.Scanner;
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int D;
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter the days no.");
		 D=input.nextInt();
		 if(D==1)
			 System.out.println("monday");
		 else if(D==2)
			 System.out.println("tuesday");
		 else if(D==3)
			 System.out.println("wednesday");
		 else if(D==4)
			 System.out.println("thursday");
		 else if(D==5)
			 System.out.println("friday");
		 else if(D==6)
			 System.out.println("saturday");
		 else if(D==7)
			 System.out.println("sunday");
		 else
			 System.out.println("invalid day");
		 input.close();

	}

}
