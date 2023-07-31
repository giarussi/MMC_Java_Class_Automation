package ZooGame;

public class Elephant extends animal {

	
	String trunk_length,age;

	public String getTrunk_length() {
		return trunk_length;
	}

	public void setTrunk_length(String trunk_length) {
		this.trunk_length = trunk_length;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}


public void dog_details() {
	
	
	setAge("54");
		
		System.out.println("You chose Elephant with details  as "+age);
		
	}


public void Elephant_details() {
	
	setTrunk_length("60 cms");
	setAge("55");
	System.out.println("You chose Elephant with details  as "+trunk_length);
	System.out.println("You chose Elephant with details  with age as "+age);
	}

	/*
	 * public void special_attribute(String loyal_dog) {
	 * 
	 * 
	 * System.out.println("You chose Elephant with attribute as loyal  ,  "
	 * +loyal_dog); }
	 */



}
