import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//ArithmeticException
//ArrayIndexOutOfBoundsException
//ClassNotFoundException
//FileNotFoundException
//IOException
//InterruptedException - threads
//NoSuchFieldException
//NoSuchMethodException
//NullPointerException
//NumberFormatException
//RuntimeException
//StringIndexOutOfBoundsException
public class ExceptionThrown {

	static int divideByZero(int a, int b) {
		int i = a / b;
		return i;
	}
	static int computeDivision(int a, int b) {
		int res = 0;
		try {
			res = divideByZero(a,b);
		}
		catch(NumberFormatException ex) {
			System.out.println("Number format exception occured!");
		}
		return res;
	}
	public static void main(String[] args) {
		// arithmetic exception
		int a = 1;
		int b = 0;
		try {
			int i = computeDivision(a,b);
		}
		catch(NullPointerException aex) {
			System.out.println(aex.getMessage());
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		// null pointer exception
		try {
			String str = null;
			char c = str.charAt(0);
		}
		catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			int arr [] = new int [3];
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			int parsedInt = Integer.parseInt("10");
			System.out.println(parsedInt * 10);
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Finally block!");
		}
		
		try {
			String abc = "abcdef";
			char c = abc.charAt(6);
		}
		catch(Throwable ex) {
			System.out.println(ex.getMessage());
		}
	}

}
