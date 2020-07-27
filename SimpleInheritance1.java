class A{
	int i ,j;
	void showij() {
		System.out.println("i and j :"+i+" "+j);
	}
}
class B extends A{
	int k;
	void showk() {
		System.out.println("K: "+k);
	}
	void sum() {
		System.out.println("i+j+k :"+(i+j+k));
	}
}
 class SimpleInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new A();
		B ob1=new B();
		ob.i=10;
		ob.j=20;
		System.out.println("Contents of ob :");
		ob.showij();
		System.out.println();
		ob1.i=7;
		ob1.j=8;
		ob1.k=9;
		System.out.println("Contents of ob1 :");
		ob1.showij();
		ob1.showk();
		System.out.println();
		System.out.println("sum of i,j,and k in ob1");
		ob1.sum();
		
		

	}

}
