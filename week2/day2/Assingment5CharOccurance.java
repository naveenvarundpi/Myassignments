package week2.day2;

public class Assingment5CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count=0;

		char[] occ=str.toCharArray();
		int len=occ.length;
		char act='e';
		for (int i=0;i<len;i++)
		{
			if(occ[i]==(act))
			{
				count=count+1;
			}
		}
		System.out.println("Number of Char "+act+" is "+count);
	}

}
