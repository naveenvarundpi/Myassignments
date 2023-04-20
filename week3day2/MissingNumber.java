package week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {

		int[] data = {3,2,10,4,6,7,2,3,3,6,7,8,5,1};
		Set<Integer>  tree=new TreeSet<Integer>();
		List<Integer> missinglist =new ArrayList<Integer>();
		for(int i=0;i<data.length;i++)
		{
			tree.add(data[i]);
		}
		System.out.println(tree);
		List<Integer> list =new ArrayList<Integer>();
		list.addAll(tree);
		System.out.println(list);
		int size=list.size();
		for(int i=1;i<=size;i++)
		{
			System.out.println(list.get(i-1));

			if(list.get(i-1)!=i)
			{
				missinglist.add(i);
				
			}
		}
		System.out.println(missinglist);
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
	}
}
