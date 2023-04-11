package week2.day2;

import java.util.Arrays;

public class Assingment5Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		String t1="";
		String t2="";
		if(text1.length()==text2.length())
		{
			char[] ch1=text1.toCharArray();
			char[] ch2=text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<ch1.length;i++)
			{
				t1=t1+ch1[i];
				t2=t2+ch2[i];

			}

			System.out.println(t1);
			System.out.println(t2);
			if(t1.equals(t2))
			{System.out.println("Both are Anagram" );}
			else {System.out.println("Both are not Anagram" );}
		}	
		else {System.out.println("Both Strings are not of same length");}

	}

}
