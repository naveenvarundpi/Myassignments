package week3day2;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {2,3,5,6,3,2,1,4,2,1,6,-1};
		int len=number.length;
		Map<Integer,Integer> map =new HashedMap<Integer, Integer>();
		for(int i=0;i<len;i++)
		{
			if (map.containsKey(number[i]))
			{
				map.put(number[i],map.get(number[i])+1);
			}
			else
			{
				map.put(number[i],1);
			}
		}
		System.out.println(map);
	}

}
