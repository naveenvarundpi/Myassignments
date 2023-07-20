package week9.day1;

public class FactorialOfANumber {
public static void main(String[] args) {
	//Find the factorial of a given number.
	int number=5;
	int factorial=1;
	for(int i=1;i<=number;i++)
	{
		factorial=factorial*i;
	}
	System.out.println("Factorial of the number "+number+" is: "+factorial);
}
}
