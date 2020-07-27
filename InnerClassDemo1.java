class Outer1{
	int outer_x=100;
	Inner1 inner =new Inner1();
	void test() {
		//Inner1 inner =new Inner1();
		inner.display();
	}
	class Inner1{
		int y=10;
		void display() {
			System.out.println("display :outer_x = "+outer_x);
		}
	}
	void showy() {
		//Inner1 inner1= new Inner1();
		System.out.println("show y ="+inner.y);
	}
	
}
public class InnerClassDemo1 {

	public static void main(String[] args) {
		 Outer1 outer1=new Outer1();
		 outer1.test();
		 outer1.showy();
	}
}
