package Week_01;

public class Day_02_Week01 {
public static void main(String[] args) {
		
		listOdd(0, -21);
		isPalindrome("hello", 30);
		listFibonacci(8);
		
		
		
	}
	
	//1)Create a class with a method which generates odd numbers between the range.
	//Odd numbers between a range
	public static void listOdd(int x_f, int x_i) {
		if (x_f > x_i) {
			if(x_i % 2 != 0) {
				for (int i = 0; i <= x_f - x_i - i; i++) {
					System.out.print(x_i + (2 * i) + " ");
					
					
				}
			}
			else if(x_i % 2 == 0) {
				for (int i = 0; i < x_f - x_i - i; i++) {
					System.out.print(x_i + (2 * i) + 1 + " ");
					
					
				}
			}
		}
		else if (x_f < x_i) {
			if(x_i % 2 != 0) {
				for (int i = 0; i <= x_i - x_f - i; i++) {
					System.out.print(x_i - 2 * i + " ");
					
					
				}
				
			}
			else if(x_i % 2 == 0) {
				for (int i = 0; i < x_i - x_f - i; i++) {
					System.out.print(x_i - (2 * i) - 1 + " ");
					
					
				}
			}
		}
	}
	
	
	//2)Create a class with method which generates fibonacci sequence
	
	public static void listFibonacci(int n) {
		if(n == 0) {
			System.out.println("Fibonacci: " + 0);
		}
		if(n == 1) {
			System.out.println("Fibonacci: " + 0 + " " + 1);
		}
		if(n > 1) {
			int[] temp = new int[n + 1];
			temp[0] = 0;
			temp[1] = 1;
			System.out.print("Fibonacci: " + 0 + " " + 1 + " ");
			for (int i = 2; i < temp.length ; i++) {
				temp[i] = temp[i - 1] + temp[i - 2];			
				
				System.out.print(temp[i] + " ");
		}
		}
	}
	
	//3)Create a class with a method which checks if the given value is palindrome or not
	public static void isPalindrome(String word, int n) {
		System.out.println();
		StringBuffer sb = new StringBuffer(word);
		sb.reverse();
		String s = sb.toString();
		if(word.equals(s)) {
			System.out.println(word + " is a palindrome.");
		}
		else {
			System.out.println(word + " is not a palindrome.");
		}
		
		String s_1 = n + "";
		StringBuffer sb_n = new StringBuffer(s_1);
		if(sb_n.reverse().toString().equalsIgnoreCase(s_1)) {
			System.out.println(s_1  + " is a Palindrome");
			
		}
		else {
			System.out.println(s_1 + " is not a palindrome.");
		}
		
		
		
	}


}
