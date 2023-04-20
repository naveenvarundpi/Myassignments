package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] test=text.split(" ");
		Set<String> unique=new LinkedHashSet<String>();
		for(int i=0;i<test.length;i++)
		{
			unique.add(test[i]);
			System.out.println(test[i]);
		}
		System.out.println(unique);

		for(String eachvalue:unique)
		{
			System.out.println(eachvalue);
		}

	}

}
