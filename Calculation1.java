class Calculation1
{
void sum(int a,int b)
{
System.out.println(a+b);
}
void sum(int a,int b,int c)
{
System.out.println(a+b+c);
}
public static void main(String args[])
{
Calculation1 c1= new Calculation1();
Calculation1 c2=new Calculation1();
c1.sum(11,4);
c2.sum(12,2,5);
}
}