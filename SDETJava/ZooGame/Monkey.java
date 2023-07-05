package ZooGame;

import java.util.Scanner;

public class Monkey extends animal {

	
	String food ,age;
	Scanner scaner = new Scanner(System.in);
	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	protected void foodmethod() {
	    System.out.println("Food  for Monkey is Guava");
	  }
	
	
	public String getname(String nme) {
		
		System.out.println(""
				+ " Monkey u nameed  as " +nme); 
		
		return nme;
			
		
	}
	
		
	public void setAnimalid(String animalid) {
		this.animalid = animalid;
	}
}
