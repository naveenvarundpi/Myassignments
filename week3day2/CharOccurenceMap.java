package week3day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections4.map.HashedMap;

public class CharOccurenceMap {

	public static void main(String[] args) {
		String name="anushakumar";
		
		Map<Character, Integer>map=new TreeMap<Character,Integer>();
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
					if(!map.containsKey(ch))
					{
						map.put(ch, 1);
					}
					else
					{
						map.put(ch,map.get(ch)+1);
					}
		}
	System.out.println(map);	
	}
	
	/*
	 * Write a java prgm using map to find the occurance of 
each character in the String given.
anusha Kumar
a = 3
n = 1
u = 2
s = 1
h = 1
k = 1
m = 1
r = 1
	 * */
	
}
