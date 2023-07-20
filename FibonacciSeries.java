package week9.day1;

public class FibonacciSeries {
public static void main(String[] args) {
	//Generate Fibonacci series up to a given number
	//count1 2 3 5 8 13 21
	
	int first=0;
	int second=1;
	int count=0;
	int num=10;
	System.out.println(first);//0
	for (int i=0;i<num;i++)
	{
		count=first+second;//0+1=0
		second=first;//second=0
		first=count;//first=1
		System.out.println(count);
	}
}
}
//1+0=1     1+1		3
//seco=1       1	2	
//first=1	2		3



