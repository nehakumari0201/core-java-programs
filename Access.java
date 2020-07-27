class A1{
	int i;
	int j;
	void Setij(int x,int y) {
		i=x;
		j=y;
		
	}
	
}
class B1 extends A1{
	int total;
	void sum() {
		total= i+j;
	}
}
public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 ob=new B1();
		ob.Setij(10, 12);
		ob.sum();
		System.out.println("Total is "+ob.total);

	}

}
