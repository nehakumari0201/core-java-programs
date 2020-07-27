class Larger3
{
int x1;
int x2;
int x3;
Larger3(int x,int y,int z)
{
x1=x;
x2=y;
x3=z;
}
void great()
{
if((x1>x2)&&(x1>x3))
{
System.out.println("x1 is greater");
}
if((x2>x1)&&(x2>x3))
{
System.out.println("x2 is largest");
}
if((x3>x1)&&(x3>x2))
{
System.out.println("x3 is largest");
}
}
public static void main(String args[])
{
Larger3 s=new Larger3(5,7,2);
Larger3 c=new Larger3(45,76,34);
s.great();
c.great();

}
}