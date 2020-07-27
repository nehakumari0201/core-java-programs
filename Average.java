
public class Average {

	public static void main(String[] args) {
		
		double nume[]= {10.1,11.2,12.3,13.4,14.5};
		double result=0;
		int i;
		for(i=0;i<5;i++) {
			result= result  + nume[i];
		}
System.out.println("Average is "+ result/5);
	}

}
