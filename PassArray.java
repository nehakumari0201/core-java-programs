 class PassArray {

	
		 static void VaTest(int v[]) {
			 System.out.println("number of args : "+ v.length+" Contents :");
			 for(int x : v)
				 System.out.print(x+" ");
			 System.out.println();
		 }

	public static void main(String args[]) {
		int n1[]= {10};
		int n2[]= {1,2,3};
		int n3[]= {};
		VaTest(n1);
		VaTest(n2);
		VaTest(n3);
	}

}
