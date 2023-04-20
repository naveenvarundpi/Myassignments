package week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer>  tree=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			tree.add(data[i]);
		}
		System.out.println(tree);
		List<Integer> list =new ArrayList<Integer>();
		list.addAll(tree);
		System.out.println(list);
		int size=list.size();
		System.out.println(list.get(size-2));
		
		//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */
	}

}
