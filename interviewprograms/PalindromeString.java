package week9.day1;

public class PalindromeString {
	public static void main(String[] args)
	{
		String input="madam";
		String reverse="";
		char[] charArray = input.toCharArray();
		//System.out.println(charArray);
		for(int i=(charArray.length-1);i>=0;i--)
		{
			{
				reverse=reverse+charArray[i];	
			}
			
		}
		System.out.println(reverse);
		if(input.equals(reverse))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
				
	}
}
