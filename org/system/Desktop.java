package org.system;

public class Desktop extends Computer{

	public String size()
	{
		String desktopsize="1920*1080";
		return desktopsize;
	}
	public static void main(String[] args) {
		Desktop systemprop=new Desktop();
		System.out.println("Desktop model is "+systemprop.computerModel());
		System.out.println("Deskotp size is "+systemprop.size());
	}
}
