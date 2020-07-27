class Calculation0
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
Calculation0 s=new Calculation0();
s.sum(2,3);

s.sum(2.3,9.7);
}
}