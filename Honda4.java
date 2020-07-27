abstract class Bike4
{
abstract void run();
}
class Honda4 extends Bike4
{
void run()
{
System.out.println("running");
}
public static void main(String args[])
{
Bike4 b=new Honda4();
b.run();
}
}