package week2.day2;

public class Assingment5FindTypes {

	public static void main(String[] args) {
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;
				char[] test1=test.toCharArray();
				int len=test1.length;
				System.out.println("Length: "+len);
				for (int i=0;i<len;i++)
				{
					if(Character.isLetter(test1[i]))
					{
						letter=letter+1;
					}
					else if(Character.isDigit(test1[i]))
					{
						num=num+1;
					}
					else if(Character.isSpaceChar(test1[i]))
					{
						space=space+1;
					}
					else
					{
						specialChar=specialChar+1;
					}	
				}	

				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);

				

	}

}

