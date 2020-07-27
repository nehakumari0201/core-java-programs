class Student5
{
int id;
String name;
Student5(int i,String n)
{id=i;
name=n;
}
Student5(Student s)
{
id=s.id;
name=s.name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student5 s1=new Student5(4,"neha");
Student5 s2=new Student5(1,"sneha");
s1.display();
s2.display();
}
}