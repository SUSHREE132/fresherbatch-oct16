package com.oops;

abstract class Car
{
	int num;
	String color;
	private static int count=1000;
	 Car(String c){
		 num=count++;
		 color=c;
		 
	 }
	 abstract void display();	 
}
class Audi extends Car
{
	Audi (String c)
	{
		super(c);
	}
	void display()
	{
		System.out.println("Audi[num="+num+",color="+color+"]");
	}
}

class Benz extends Car
{
	Benz(String c)
	{
		super(c);
	}
	void display()
	{
		System.out.println("Benz[num="+num+",color="+color+"]");
	}
}

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a=new Audi("white");
		a.display();
		Benz b=new Benz("black");
		b.display();

	}

}
