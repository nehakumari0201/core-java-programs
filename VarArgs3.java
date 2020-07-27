
 class VarArgs3 {
	static void VaTest(int ...v) {
		System.out.println("VaTest(int ...) :"+v.length+" Contents :");
		for(int x: v)
			System.out.print(x +" ");
		System.out.println();
	}
	static void VaTest(boolean...v) {
		System.out.println("VaTest(boolean...v) "+"Number of args:" +v.length + "contents :");
		for (boolean x:v)
			System.out.print(x +" ");
		System.out.println();
	}
	static void VaTest(String msg,int ...v) {
		System.out.print("vaTest (boolean...) "+"Number of args :"+v.length+"contents:");
		for(int x:v)
			System.out.print(x+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		 VaTest(1,2,3);
		 VaTest("Testing: ",10,20);
		 VaTest(true,false,false);
		 
		 

	}

}
