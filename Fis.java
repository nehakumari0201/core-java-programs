import java.io.FileInputStream;
public class Fis
{
public static void main(String args[])
{
try
{
FileInputStream f= new FileInputStream("f://nehajava/neha1.txt");
int i=f.read();
System.out.println((char)i);
f.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}