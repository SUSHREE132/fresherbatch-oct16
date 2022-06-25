package com.genric;

public class Four<Key, Value> {
   
	//class if of generic type
	Key key;
	Value value;
	
	//Parametrized Constructor
	public Four(Key key, Value value) {
		super();
		this.key = key;
		this.value = value;
	}
	//Getter and Setter method
	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public static void main(String[] args) {
		//Creation of first object
		Four<String, String> pair=new Four<String, String>("", "");
		pair.setKey("1");
        pair.setValue("Welcome");
        System.out.println(pair.toString());
    	//Second Object
		Four<String,String> pair1=new Four<String,String>("","");
		pair1.setKey("2");
		pair1.setValue("We all are software developer");
		System.out.println(pair1.toString());
		
		//Creation of object 3rd time
		Four<String, String> pair2=new Four<String, String>("", "");
		pair2.setKey("This is");
		pair2.setValue("JSF Training batch");
		System.out.println(pair2.toString());
	}
	
	@Override
	public String toString() {
		return "Paired [Key=" + key + ", Value=" + value + "]";

	}

}
