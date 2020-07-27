public class Emp
{
int id;
String name;
Address address;
public Emp(int id,String name,Address address)
{
this.id=id;
this.name=name;
this.address=address;
}
void display()
{
System.out.println(id+" "+name);
System.out.println(address.city+" "+address.state+" "+address.country);
}
public static void main(String args[])
{
Address a=new Address("patna","bihar","india");
Address b=new Address("kankarbag","bihar","india");
Emp e1=new Emp(123,"neha",a);
Emp e2=new Emp(111,"kavita",b);
e1.display();
e2.display();
}
}
