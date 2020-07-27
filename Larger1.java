class Larger1
{
int a,b;
Larger1(int a1,int b1)
{
a=a1;
b=b1;
}
void great()
{
if(a>=b)
{
System.out.println("a is larger="+a);
}
else
{
System.out.println("b is larger="+b);
}
}
public static void main(String args[])
{
Larger1 s=new Larger1(2,4);
s.great();
}
}