import java.io.DataInputStream;
public class Reading {


	public static void main(String args[]) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int  intNumber =0;
		float floatNUmber=0.0f;
		try 
		{
			System.out.println("Enter an Interger:");
			intNumber=Integer.parseInt(in.readLine());
			System.out.println("Enter a float number ");
			floatNUmber=Float.valueOf(in.readLine()).floatValue();
			}
		catch(Exception e) {}
		System.out.println("intNumber ="+intNumber);
		System.out.println("floatNUmber ="+floatNUmber);

}
}
