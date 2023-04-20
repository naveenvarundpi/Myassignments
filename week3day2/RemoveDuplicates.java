package week3day2;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="PayPal India";
		char[] ch= test.toCharArray();
		List<Character> list=new ArrayList<Character>();
		List<Character> duplist=new ArrayList<Character>();
		int len=ch.length;
		//System.out.println(len);
		for(int i=0;i<len;i++)
		{
			if(list.contains(ch[i]))
			{
				duplist.add(ch[i]);
				
			}
			else {
				list.add(ch[i]);
			}	
				
			//System.out.println(ch[i]);
		}
		list.remove(4);
		//boolean contains = list.contains("");
		//System.out.println(contains);
		//System.out.println(list);
		//System.out.println(duplist);
		for (Character eachvalue:duplist)
		{
			if(list.contains(eachvalue))
			{
				list.remove(eachvalue);
			}
		}
		System.out.println(list);
		System.out.println(duplist);	
		


		//		Declare a String as "PayPal India"

		//		Convert it into a character array

		//		Declare a Set as charSet for Character

		//		Declare a Set as dupCharSet for duplicate Character

		//		Iterate character array and add it into charSet

		//		if the character is already in the charSet then, add it to the dupCharSet

		//		Check the dupCharSet elements and remove those in the charSet

		//		Iterate using charSet

		//		Check the iterator variable isn't equals to an empty space

		//		print it

	}

}
