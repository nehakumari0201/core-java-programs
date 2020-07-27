class Add1
{
int a,b;
int c;
Add1(int a1,int b1)
{
a=a1;
b=b1;
}
void sum()
{
c=a+b;
System.out.println(c);
}
void display()
{
System.out.println(a+" "+b);
}
public static void main(String args[])
{
Add1 n= new Add1(12,4);
Add1 m=new Add1(6,4);
n.display();
n.sum();
m.display();
m.sum();
}
}
