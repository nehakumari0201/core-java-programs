import java.util.Scanner;
import java.lang.Math;
class AreaOfCircle
{
public static void main(String args[])
{

Scanner radius=new Scanner(System.in);
System.out.println("Enter the radus of circle ");
int r;
r=radius.nextInt();
double pi=3.14, area;
area=pi*r*r;
System.out.println("Area of circle is ="+area);
}
}
