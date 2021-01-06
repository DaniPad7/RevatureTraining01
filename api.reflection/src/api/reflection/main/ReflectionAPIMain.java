package api.reflection.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

import api.reflection.classes.ChildClass;

public class ReflectionAPIMain {

	public static void main(String[] args) {
		//instantiate
		Class<?> childClass = ChildClass.class;
		childClass = new ChildClass(5).getClass();
		
		try {
			childClass= Class.forName("api.reflection.classes.ChildClass");
			
			//getting the super class
			Class<?> superClass = Class.forName("api.reflection.classes.ChildClass").getSuperclass();
			System.out.println("Superclass of ChildClass is: " + superClass);
			System.out.println("Superclass of ObjectClass is: " + Object.class.getSuperclass() + " which is expected");
			System.out.println("The SuperClass of the StringArray class is: " + String[][].class.getSuperclass());
			
			//getting the public members of a class
			Class<?>[] classes = childClass.getClasses();
			System.out.println("Here are all the public members of ChildClass: " + Arrays.toString(classes));
			
			//getting  the declared classes of a class
			Class<?>[] explicitClasses = Class.forName("api.reflection.classes.ChildClass").getDeclaredClasses();
			System.out.println("The declared members of ChildClass are: " + explicitClasses);
			
			
			
			
			
			
			
			
			
			
			
			
			//invoking private method
			Method	method = Class.forName("api.reflection.classes.RegularClass").getDeclaredMethod("method3", null);
			method.setAccessible(true);
			method.invoke(null, null);
			
			//Getting public constructor from child class
			Constructor<?> constructor = Class.forName("api.reflection.classes.ChildClass").getConstructor(int.class);
			System.out.println("ChildClass constructor parameter type/s ----> " + Arrays.toString(constructor.getParameterTypes())); //prints: [int]
			
			//HashMap constructor
			Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
			System.out.println("HashMap constructor parameter type --> " + Arrays.toString(hashMapConstructor.getParameterTypes())); //prints: []
			
			//Instantiating a class using the constructor through reflection
			Constructor<?> constructor0 = Class.forName("api.reflection.classes.ChildClass").getConstructor(int.class);
			System.out.println("ChildClass constructor parameters ---> " + Arrays.toString(constructor.getParameterTypes()));
			
			Object myObj = constructor0.newInstance(10);
			Method myObjMethod = myObj.getClass().getMethod("method1", null);
			myObjMethod.invoke(myObj, null); //prints: Method1 impl.
			
			//Now for Hashmap instantiation by counstructor through reflection.
			Constructor<?> hashMapConstructor0 = Class.forName("java.util.HashMap").getConstructor(null);
			System.out.println("HashMap constructor parameter type/s ---> " + Arrays.toString(hashMapConstructor0.getParameterTypes()));
			HashMap<String,String> myMap = (HashMap<String,String>) hashMapConstructor0.newInstance(null);
			
			
			
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
			e.printStackTrace();
		}
		
	}

}
