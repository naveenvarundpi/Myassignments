package week3day2;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.commons.collections4.map.HashedMap;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="abbbabacccccc";
		char[] ch=test.toCharArray();
		int len=ch.length;
		Map<Character,Integer> map=new TreeMap<Character, Integer>();
		for(int i=0;i<len;i++)
		{
			if(map.containsKey(ch[i]))
			{
				map.put(ch[i],map.get(ch[i])+1);
			}
			else
			{
				map.put(ch[i],1);
			}
		}
		int size = map.size();
		System.out.println(size);
		int maxvalue=(Collections.max(map.values()));
		System.out.println(maxvalue);
		for (Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==maxvalue)
			{
				System.out.println(entry.getKey());
			}
		}
			}

}
