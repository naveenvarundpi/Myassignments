package week9.day1;

public class PrimeNumber 
{

public static void main(String[] args) {
	//Prime number
	//3,5,7,11
	int a=22;
	int count=0;
	for(int i=2;i<a;i++)
	{
		if(a%i==0)
		{
			count=count+1;
			break;
			
		}
	}
	if(count==0)
	{
		System.out.println("The number is prime");
	}
	else 
	{
		System.out.println("The number is not prime");
	}
}
}
