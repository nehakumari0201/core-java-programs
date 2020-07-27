import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class ReadAndWrite {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner diskScanner=new Scanner(new File("D:\\javaprogram\\InputOutput\\enterInput.txt"));
		PrintStream diskwrite=new PrintStream("showoutput.txt");
		double unitPrice,total;
		int quantity;
		unitPrice =diskScanner.nextDouble();
		quantity=diskScanner.nextInt();
		total=unitPrice*quantity;
		diskwrite.println("Total="+total);
		diskScanner.close();
		diskwrite.close();

	}

}
