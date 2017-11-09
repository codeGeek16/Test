package com.sahil.hashEqualsOverride;

public class HashEqualsOver {

	private String name;
	private String address;
	private int age;

	public HashEqualsOver(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "HashEqualsOver [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj){
		if(obj== this) return true;
		if(obj==null || obj.getClass()!=this.getClass())
			return false;
		HashEqualsOver hashEqualsOver = (HashEqualsOver)obj;
		return age==hashEqualsOver.age &&
				name.equals(hashEqualsOver.name)&&
				address.equals(hashEqualsOver.address);
	}
	
	@Override
	public int hashCode(){
		int result = 17;
		result = result*31+age;
		result = result*31+address.hashCode();
		result = result*31+name.hashCode();
		
		return result;
		
	}
	
	public static void main(String[] args) {
		HashEqualsOver obj1 = new HashEqualsOver("Sahil", "Bangalore", 25);
		HashEqualsOver obj2 = new HashEqualsOver("Sahil", "Bangalore", 25);
		System.out.println("Two objects equal:" + obj1.equals(obj2));
		System.out.println("Hash code returned for obj 1 ="+obj1.hashCode());

	}


}
