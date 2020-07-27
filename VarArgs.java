
public class VarArgs {
	static void VaTest(int ...v) {
		System.out.println("number of args :"+v.length+" Contents:");
		for(int x :v)
			System.out.println(x + "");
		System.out.println();
	}

	public static void main(String[] args) {
		 VaTest(10);
		 VaTest(1,2,3);
		 VaTest();

	}

}
