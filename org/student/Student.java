package org.student;

import org.department.Department;

public class Student extends Department {
	public String studentName() {
		String studentname="test student";
		return studentname;
	}
	public String studentDept()
	{
		String studentdept="EEE";
		return studentdept;
	}
	public String studentId()
	{
		String studentid="123rt";
		return studentid;
	}
	public static void main(String[] args) {
		Student st=new Student();
		System.out.println("College Name is: "+st.collegeName());
		System.out.println("College code is: "+st.collegeCode());
		System.out.println("College rank is: "+st.collegeRank());
		System.out.println("College Department is: "+st.departmentname());
		System.out.println("Student Name is: "+st.studentName());
		System.out.println("Student Department is: "+st.studentDept());
		System.out.println("College id is: "+st.studentId());
	}
}
