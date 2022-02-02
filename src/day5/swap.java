package day5;
import java.util.*;
public class swap 
{	
	public static void main(String args[])
	{
		String a ;
		String b ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string name ");
		a=sc.nextLine();
		System.out.println("enter the second string name ");
		b=sc.nextLine();
		
		System.out.println("Strings before swap: a = " +
									a + " and b = "+b);
		
		a = a + b;
		b = a.substring(0,a.length()-b.length());
		
		a = a.substring(b.length());
		System.out.println("Strings after swap: a = " + a + " and b = " + b);		
	}	
}