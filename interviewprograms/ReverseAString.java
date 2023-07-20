package week9.day1;

public class ReverseAString {

	public static void main(String[] args) {
		//Reverse a string without using any built-in functions
		String input="Naveen";
		String rev="";
		char[] charArray = input.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			rev=rev+charArray[i];
		}
		System.out.println(rev);
		//Check if a string is a palindrome or not.
		if (rev.equals(input)) {
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}
}
