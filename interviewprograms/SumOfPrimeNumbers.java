package week9.day1;

public class SumOfPrimeNumbers {
public static void main(String[] args) {
	//Write a program to find the sum of all prime numbers within a given range (eg, between 1 and 100)
	int count=0;
	int k=0;
	for(int i=2;i<=100;i++)
	{
		k=0;
		//to check whether the given number is prime or not
		for(int j=2;j<=i/2;j++)
		{
			
			if(i%j==0)
			{
				k=k+1;
				break;	
			}
		}
		if(k==0)
		{
			count=count+i;
		}
	}
	System.out.println(count);
}
}
