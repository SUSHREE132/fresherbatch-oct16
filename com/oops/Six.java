package com.oops;

abstract class Persistence
{
	int num;
	private static int count=100;
	Persistence (String c){
		num=count++;
	}
	
	abstract void persist();
}


class FilePersistence extends Persistence
{
	FilePersistence(String c){
		super(c);
	}
	void persist() {
		System.out.println("file store");
		
	}
}


class DatabasePersistence extends Persistence
{
    DatabasePersistence (String c){
    	super(c);
    }
	void persist() {
		System.out.println("file store");
		
	}
}

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilePersistence a=new FilePersistence("aaa");
		a.persist();
		

	}

}
