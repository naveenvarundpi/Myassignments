package week3day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="babu";
		char[] ch=name.toCharArray();

		Set<Character> uniquecharacter=new HashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{ 

			//System.out.println(ch[i]);
			if(uniquecharacter.contains(ch[i]))
			{
				uniquecharacter.remove(ch[i]);
			}
			else
			{
				uniquecharacter.add(ch[i]);
			}
		}
		System.out.println();
		for(char eachset:uniquecharacter)
		{System.out.println(eachset);}

	}

}
