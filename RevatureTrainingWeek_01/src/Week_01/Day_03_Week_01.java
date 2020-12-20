package Week_01;

public class Day_03_Week_01 {
	
	// 1)Print the array in reverse order
	public static void arrayReverse(int[] ar) {
		for (int i = ar.length - 1; i > -1; i--) {
			System.out.print(ar[i] + " ");
		
		}
		System.out.println();
		}
	
	// 2)Delete specific element from an array
	public static void deleteElement(int n, int[] ar) {
		for (int i = 0; i < n - 1; i++) {
			System.out.print(ar[i] + " ");
			
		}
		for (int i = n - 1; i < ar.length - 1 ; i++) {
			ar[i] = ar[i + 1];
			System.out.print(ar[i] + " ");
			}
		System.out.println();
	}
	
	
	
	
	public static void main(String[] args) {
		int ar[]= {12,33,11,2,344,11,12,11,22,11,11,23,11,44,11,22,11};
		
		// 1)Print the array in reverse order
		arrayReverse(ar);	
		
		// 2)Delete specific element from an array
		deleteElement(1, ar);


		// 3)Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
		// 4)Find the sum of all even and odd numbers seperately and print the max out of it.(max of sum of even vs odd)
		// 5)Find the minimum and the maximum element in an array
		// 6)Find all Palindrome numbers in an array 
		 
		
		


	
		//Task - Try the same stuff with Long, Double and Float
		Long i7 = 10L;
		Long i8 = 10L;
		Long i9 = new Long(10L);
		System.out.println("i7 = " + i7);
		System.out.println("i8 = " + i8);
		System.out.println("i9 = " + i9);
		System.out.println("i7 == i8 " + (i7 == i8));
		System.out.println("i7 == i9 " + (i7 == i9));
		
		System.out.println("i7.equals(i8)) " + (i7.equals(i8)));
		System.out.println("i7.equals(i9)) " + (i7.equals(i9)));
		
		Long x = i7; //Autoboxing
		System.out.println("x = " + x);
		x = 1000L;
		i7 = x;
		System.out.println("i7 = " + i7);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		//Java reads everything as String and Java writes everything as String
		String s = "33";
		Long age = Long.parseLong(s); //similar method in all other Wrapper classes except Character. 
		System.out.println("age = " + age);
		
		age = 99L;
		s = age + "";
		System.out.println("s = " + s);
		Long i10 = 1000L;
		s = i10.toString();
		System.out.println("s = " + s);
		
		System.out.println(Long.toBinaryString(10));
		System.out.println(Long.toHexString(10));
		System.out.println(Long.toOctalString(10));
		
		//compareTo - if 1st object is greater then the 2nd it will return +1 if it is same it will return 0 else -1
		System.out.println("i10 = " + i10);
		System.out.println("i10.compareTo(1000) "+i10.compareTo(1000L));
		System.out.println("i10.compareTo(2000) "+i10.compareTo(2000L));
		System.out.println("i10.compareTo(100) "+i10.compareTo(100L));
		
		Double d = 12.55;
		Integer ii_1 = 12;
		Float ff_2 = 12f;
		Long f = d.longValue();
		System.out.println("f (double to long) = " + f);
		Long ff_11 = ii_1.longValue();
		System.out.println("f (integer to long) = " + ff_11);
		Long ff_22 = ff_2.longValue();
		System.out.println("f (float to long) = " + ff_22);
		
		//Double
		Double i11 = 10d;
		Double i12 = 10d;
		Double i13 = new Double(10d);
		System.out.println("\n\ni11 = " + i11);
		System.out.println("i12 = " + i12);
		System.out.println("i13 = " + i13);
		System.out.println("i11 == i12 " + (i11 == i12));
		System.out.println("i11 == i13 " + (i11 == i13));
		
		System.out.println("i11.equals(i12)) " + (i11.equals(i12)));
		System.out.println("i11.equals(i13)) " + (i11.equals(i13)));
		
		Double y = i11; 
		System.out.println("y = " + y);
		y = 1000d;
		i11 = y;
		System.out.println("i11 = " + i11);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		String s_1 = "33";
		Double age_1 = Double.parseDouble(s_1); 
		System.out.println("age = " + age_1);
		
		age_1 = 99d;
		s_1 = age_1 + "";
		System.out.println("s = " + s_1);
		Double i14 = 1000d;
		s_1 = i14.toString();
		System.out.println("s = " + s_1);
		
		//System.out.println(Double.toBinaryString(10));
		System.out.println(Double.toHexString(10));
		//System.out.println(Double.toOctalString(10));
		
		System.out.println("i14 = " + i14);
		System.out.println("i14.compareTo(1000) "+i14.compareTo(1000d));
		System.out.println("i14.compareTo(2000) "+i14.compareTo(2000d));
		System.out.println("i14.compareTo(100) "+i14.compareTo(100d));
		
		Long ll_1 = 12L;
		Integer i_1 = 12;
		Float ff_1 = 12f;
		Double dd_1 = ll_1.doubleValue();
		System.out.println("f (long to double) = " + dd_1);
		Double dd_11 = i_1.doubleValue();
		System.out.println("f (integer to double) = " + dd_11);
		Double dd_12 = ff_1.doubleValue();
		System.out.println("f (float to double) = " + dd_12);
		
	
		
		//Float
		Float i15 = 10f;
		Float i16 = 10f;
		Float i17= new Float(10f);
		System.out.println("\n\ni15 = " + i15);
		System.out.println("i16 = " + i16);
		System.out.println("i17 = " + i17);
		System.out.println("i15 == i16 " + (i15 == i16));
		System.out.println("i15 == i17 " + (i15 == i17));
		
		System.out.println("i15.equals(i16)) " + (i15.equals(i16)));
		System.out.println("i15.equals(i17)) " + (i15.equals(i17)));
		
		Float z = i15; 
		System.out.println("z = " + z);
		z = 1000f;
		i15 = z;
		System.out.println("i15 = " + i15);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		String s_2 = "33";
		Float age_2 = Float.parseFloat(s_2); 
		System.out.println("age = " + age_2);
		
		age_2 = 99f;
		s_2 = age_2 + "";
		System.out.println("s = " + s_2);
		Float i18 = 1000f;
		s_2 = i18.toString();
		System.out.println("s = " + s_2);
		
		//System.out.println(Float.toBinaryString(10));
		System.out.println(Float.toHexString(10));
		//System.out.println(Float.toOctalString(10f));
		
		System.out.println("i18 = " + i18);
		System.out.println("i18.compareTo(1000) "+i18.compareTo(1000f));
		System.out.println("i18.compareTo(2000) "+i18.compareTo(2000f));
		System.out.println("i18.compareTo(100) "+i18.compareTo(100f));
		
		Integer i_2 = 12;
		Long l_2 = 12L;
		Double d_2 = 12.55;
		Float f_2 = i_2.floatValue();
		System.out.println("f (integer to float)= " + f_2);
		Float f_21 = l_2.floatValue();
		System.out.println("f (long to float)= " + f_21);
		Float f_22 = d_2.floatValue();
		System.out.println("f (double to float)= " + f_22);
		
		//Task  - Print all palindromes between 1000 and 9999 with the above style stringbufferstringbuilderdemo\Palindrome.java
		//Task - Convert every word's last character to uppercase and print back the sentence. stringbufferstringbuilder\Titlecase.java
		//task1 - write a program to validate an SSN number using regex stringdemo\regex_pack\MobileNuumbervalidation.java
		//task2 - write a program to validate DL stringdemo.regex_pack\
		//regexdemo1.java paraphrases regex package
	
	
	}

}
