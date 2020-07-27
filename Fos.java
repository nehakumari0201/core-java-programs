import java.io.FileOutputStream;
public class Fos
{
public static void main(String args[])
{
try{
FileOutputStream f= new FileOutputStream("f://nehajava/neha.txt");
String s="welcome to java ";
byte b[]=s.getBytes();
f.write(b);
f.close();
System.out.println("success");
}

catch(Exception e)
{
System.out.println(e);
}
}}