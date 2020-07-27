
 class VarArgs4 {
	 static void test(int ...v) {
		 System.out.println("test(int...): "+"Number of args : " +v.length+ "Contents :");
		 for(int x:v)
			 System.out.print(x+ " ");
		 System.out.println();
	 }
	 static void test(boolean ...v) {
		 System.out.println("test(boolean...) "+"Number of args: "+v.length+"contents :");
		 for(boolean x:v)
			 System.out.print(x +" ");
		 System.out.println();
		 
	 }
	 

	public static void main(String[] args) {
		 test(1,2,3);
		 test(true,false,false);
		// test();

	}

}
