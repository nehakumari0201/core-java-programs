
public class Array {

	public static void main(String[] args) {
		 int month_days[];
		 month_days= new int[12];
		 month_days[0]=31;
		 month_days[1]=28;
		 month_days[2]=31;
		 month_days[3]=30;
		 month_days[4]=31;
		 month_days[5]=30;
		 month_days[6]=31;
		 month_days[7]=31;
		 month_days[8]=30;
		 month_days[9]=31;
		 month_days[10]=30;
		 month_days[11]=31;
		 System.out.println("Number of days in each month.");
		 for(int i=0;i<12;i++) {
			 System.out.print("\t" +month_days[i]);
		 }
		 System.out.print("\t");
		 System.out.println("April has "+month_days[3]+ " days.");
				 
		 
		 
	}

}
