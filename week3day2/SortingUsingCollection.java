package week3day2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] company= {"HCL","Wipro","Aspire Systems","CTS"};
		Arrays.sort(company);
		for(int j=company.length-1;j>=0;j--)
		{
			System.out.println(company[j]);
		}
		Set<String> set =new TreeSet<String>();
		for(int i=0;i<company.length;i++)
		{
			set.add(company[i]);
		}
		System.out.println(set);

		Object[] new1=set.toArray();

		for(int j=new1.length-1;j>=0;j--)
		{
			System.out.println(new1[j]);
		}

	}

}
