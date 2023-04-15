package org.student;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Student id is "+id);
	}
	public void getStudentInfo(String name)
	{
		System.out.println("Student name is "+name);
	}
	public void getStudentInfo(String email,long phoneno)
	{
		System.out.println("Student email is "+email);
		System.out.println("Student Phone number is "+phoneno);
	}
	public static void main(String[] args) {
		Students info=new Students();
		info.getStudentInfo(123);
		info.getStudentInfo("Test Name");
		info.getStudentInfo("test123@xyz.com",9876543211l);
	}
}
