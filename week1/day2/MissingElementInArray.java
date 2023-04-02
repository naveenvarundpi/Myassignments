package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i=1;i<arr.length;++i)
		{
			if(arr[i-1]!=i)
			{
				System.out.println("Missing element in the array is "+i );
				break;
			}
		}
	}
}
