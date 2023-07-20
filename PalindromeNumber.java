package week9.day1;

public class PalindromeNumber {
	public static void main(String[] args)
	{
		int a=253;
		int b=a;
		int reverse=0;
		int temp=0;
		while(a>0)
		{
		temp=a%10;
		a=a/10;
		reverse=(reverse*10)+temp;
		//reverse=reverse*10;
		}
		System.out.println(reverse);
		if(b==reverse)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
	}
}
