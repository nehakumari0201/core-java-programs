class Outer2{
	int outer_x=100;
	
	void test() {
		for(int i=0;i<10;i++) {
			class Inner{
			void display() {
				System.out.println("display outer_x ="+outer_x);
			}
		}
		Inner inner =new Inner();
		inner.display();
	}
		}
}
 public class InnerclassDemo2 {

	public static void main(String[] args) {
		 Outer2 x =new Outer2();
		 x.test();

	}

}