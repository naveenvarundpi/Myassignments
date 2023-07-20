package week9.day1;

public class SumOfDigits {
public static void main(String[] args) {
	//Calculate the sum of digits in a number.
	int number=1256;
	int count=0;
	int div=0;
	while(number>0)
	{
		div=number%10;
		count=count+div;
		number=number/10;
	}
	System.out.println(count);
}
}
