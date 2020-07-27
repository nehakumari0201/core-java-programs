import  java.io.FileOutputStream;
public class Fops
{
public static void main(String args[])
{
try
{
FileOutputStream f= new FileOutputStream("f://neha.txt");
f.write(34);
f.close();
System.out.println("success");
}
catch(Exception e)
{
System.out.println(e);
}
}
}