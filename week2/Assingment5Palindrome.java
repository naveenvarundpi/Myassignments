package week2.day2;

public class Assingment5Palindrome {
public static void main(String[] args) {
	String org="madam";
	String rev="";
	char[] ch=org.toCharArray();
	for(int i=(org.length()-1);i>=0;i--)
	{
		//System.out.println(ch[i]);
		rev=rev+ch[i];
	}	
		
	if(org.equals(rev))
	{
		System.out.println(org+" is palindrome");
		
	}
	else
	{
		System.out.println(org+" is not a palindrome");
	}
	
}
}
