class Calculation2
{
void sum(int a,int b)
{
System.out.println(a+b);
}
void sum(double a,double b)
{
System.out.println(a+b);
}
public static void main(String args[])
{
Calculation2 c1= new Calculation2();
Calculation2 c2=new Calculation2();
c1.sum(11,4);
c2.sum(1.2,2.5);
}
}