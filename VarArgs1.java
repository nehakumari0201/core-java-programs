
 class VarArgs1 {
	 static void vaTest(String msg ,int ...v) {
		 System.out.println(msg +v.length +"contents");
		 for(int x:v)
			 System.out.print(x+ " ");
		 System.out.println();
	 }

	public static void main(String[] args) {
		 vaTest("one vararg: ",10);
		 vaTest("three varargs :",1,2,3);
		 vaTest("No varargs");

	}

}
