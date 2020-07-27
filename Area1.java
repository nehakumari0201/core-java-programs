class Area1
{
int r;
double a;
Area1(int r1)
{
r=r1;
}
void area()
{
a=r*r*3.14;
System.out.println(a);
}
public static void main(String args[])
{
Area1 c1=new Area1(3);
c1.area();
}
}
