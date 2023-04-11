package week2.day2;

public class Assingment5ReverseEvenWords {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		String test = "I am a software tester"; 
		char ch;
		String updated="",nstr="";
		String[] splittest=test.split(" ");
		for (int i=0;i<splittest.length;i++)
		{
			if((i+1)%2==0)
			{
				for (int j=0;j<splittest[i].length();j++)
				{
					ch=splittest[i].charAt(j);
					nstr=ch+nstr;
				}
			}
			else
			{
				nstr=splittest[i];
			}
			updated=updated+" "+nstr;
			nstr="";

		}
		System.out.println("Reversed Even words: "+updated);



	}

}
