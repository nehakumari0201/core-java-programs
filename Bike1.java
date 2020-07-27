class Vehicle
{
void run()
{
System.out.println("vehicle is runing");
}
}
class Bike1 extends Vehicle
{/*
void run()
{
System.out.println("bike is runing");
}*/
public static void main(String args[])
{
Bike1 obj=new Bike1();
obj.run();
}

}