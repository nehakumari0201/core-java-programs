class Employee
{
int salary=4000;
}
class Programmer extends Employee
{
int bouns=10000;
public static void main(String args[])
{
Programmer p1=new Programmer();
System.out.println("programmer salary is ="+p1.salary);
System.out.println("bouns of programmer is="+p1.bouns);
}
}
 