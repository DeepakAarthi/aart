package palindrome;

public class palindrome {

	public static void main(String[] args) {
		HOME C C++ DS Java AWT Collection Jdbc JSP Servlet SQL PL/SQL C-Code C++-Code Java-Code Project Interview

		Custom Search
		  Search
		Tutorial4us - Easy to Learn
		Html Html5 CSS JavaScript Ajax JQuery AngularJS JSON GMaps Adsense Blogger Earning Email Domain SEO SMO ABOUT | SERVICES | FORMS | CONTACT
		Java Programs
		Java Programs
		Program Home
		JP - Hello world!
		JP - Sum of number
		JP - Receive input by keyboard
		JP - Find Even and Odd
		JP - Swap two numbers
		JP - Prime Number
		JP - Factorial of Number
		JP - Table of any Number
		JP - Reverse of Number
		JP - Fibonacci Series
		JP - Armstrong Number
		JP - Find Greatest Number
		JP - Palindrome Number
		JP - Calculate Sum of Digits
		JP- Count number of Digits
		JP - Sort Array Elements
		JP - BuzzFizz Program
		Number Conversion
		JP - Decimal to Binary
		JP - Decimal to Octal
		JP - Decimal to HexaDecimal
		JP - Binary to Decimal
		JP - Binary to Octal
		JP - Binary to HexaDecimal
		Formula Based Programs
		JP - Celsius to Fahrenheit
		JP - Fahrenheit to Celsius
		Oop's Concept
		JP - Inheritance
		JP - Encapsulation
		JP - Abstraction
		JP - Polymorphism
		Print Any Patterns
		JP - Triangle of Star
		JP - Print Number Pattern
		JP - Print Alphabet Pattern
		JP - Print Diamond of Star
		JP - Pascal Triangle
		Programming Tools
		Dos Box
		Palindrome number in Java
		Prev Tutorial	Next Tutorial
		Palindrome Number Program in Java

		A Palindrome number is a number that remains the same when its digits are reversed. Like 16461, for example: we take 121 and reverse it, after revers it is same as original number.

		Steps to write program

		Get the number from user.
		Reverse it.
		Compare it with the number entered by the user.
		If both are same then print palindrome
		Else print not a palindrome.
		Palindrome Number Program in Java
		import java.util.Scanner;
		class Palindrome 
		{
		public static void main(String[] args) 
		{
		int a,no,b,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any num: ");
		no=s.nextInt();
		b=no;
		while(no>0)
		{
		a=no%10;
		no=no/10;
		temp=temp*10+a;
		}
		if(temp==b)
		{
		System.out.println("Palindrome");
		}
		else
		{
		System.out.println("not Palindrome");
		}
		}
		}
	

	}

}
