class OverloadDemo1{
	void test() {
		System.out.println("no parameter");
	} 
	void test(int a,int  b) {
		System.out.println("a and b: " +a +" "+b);
	}
	void test(double a) {
		System.out.println("Inside  test(double) a: "+a);
	}
}
public class Overload1 {

	public static void main(String[] args) {
		OverloadDemo1 ob=new OverloadDemo1();
		int i =88;
		ob.test();
		ob.test(10,20);
		ob.test(i);
		ob.test(123.2);
		 

	}

}
