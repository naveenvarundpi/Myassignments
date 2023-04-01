package week1.day1;

public class IsPrime {
	public static void main(String[] args)
	{
		int n=173;
		int prime;
		int check = 0;
		for (int i=2;i<=n-1;i=i+1)
		{
			//System.out.println(i);
			prime=n%i;
			//System.out.println(prime);
			if (prime == 0)
			{
				System.out.println("Number: "+n+" is not prime");
				check=1;
				break;
			}	
		}
		if(check==0)
		{
			System.out.println("Number:"+n+" is prime");
		}
	}
}
