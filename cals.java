class Calculations
{
void sum(int a,int b)
{
System.out.println(a+b);
}
void sum(double a,double b)
{
System.out.println(a+b);
}
public static void main(String arge[])
{
Calculations c1=new Calculations();
c1.sum(11.2,12.8);
c1.sum(30,54);
}
}