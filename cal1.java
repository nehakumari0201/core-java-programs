class Calculation1
{
void sum(int a,long b)
{
System.out.println(a+b);
}
void sum(int a,int b,int c)
{
System.out.println(a+b+c);
}
public static void main(String args[])
{
Calculation1 c1 =new Calculation1();
c1.sum(33,56);
c1.sum(12,45,32);
}
}
