package api.reflection.classes;

import api.reflection.interfaces.RegularInterface;

public class ChildClass extends RegularClass implements RegularInterface{
	public int publicInt;
	private String privateString = "private string";
	protected boolean protectedboolean;
	Object defaultObject;
	
	public ChildClass(int i) {
		this.publicInt = i;
	}

	@Override
	public void method1() {
		System.out.println("Method1 impl.");
		
	}

	@Override
	public int method2(String string) {
		System.out.println("Method2 impl.");
		return 0;
	}
	
	@Override
	public int method4() {
		System.out.println("Method4 overriden");
		return 0;
	}
	
	public int method5(int i) {
		System.out.println("Method4 overriden");
		return 0;
	}
	
	//inner classes
	public class ChildClassPublicClass{}
	private class ChildClassPrivateClass{}
	protected class ChildClassProtectedClass{}
	class ChildClassDefaultClass{}
	
	//member enum
	enum ChildClassDefaultEnum{}
	public enum ChildClassPublicEnum{}
	
	//member interface
	public interface ChildClassPublicInterface{}
	

}
