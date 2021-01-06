package api.reflection.classes;

import api.reflection.interfaces.RegularInterface;

public class RegularClass{
	
	public int regularInt;
	private int privateInt;
	
	public int baseInt;
	
	private static void method3() {
		System.out.println("Method3");
	}
	
	public int method4() {
		System.out.println("Method4");
		return 0;
	}
	
	public static int method5() {
		System.out.println("Method5");
		return 0;
	}
	
	void method6() {
		System.out.println("Method6");
	}
	
	//inner public class
	public class RegularClassInnerClass{}
	
	//member public enum
	public enum RegularClassMemberEnumm{}
	

		
	
	
	

}
