class Vechicles
{
//int speed=20;
void run()
{System.out.println("run");
}}
class Bikes extends Vechicles
{
//int speed=50;
void run()
{super.run();
System.out.println("runing");
}
public static void main(String args[])
{
Bikes a=new Bikes();
a.run();
}
}