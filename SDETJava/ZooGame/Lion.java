package ZooGame;

public class Lion extends animal {

	
	String hunting_exp,age;

	public String getHunting_exp() {
		return hunting_exp;
	}

	public void setHunting_exp(String hunting_exp) {
		this.hunting_exp = hunting_exp;
		System.out.println("You details as  "+hunting_exp);
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
		System.out.println("You chose lion with age  as  "+age);
		
	}
	
public void dog_details() {
	
	animaltype="king of beasts";
	age="55";
	hunting_exp="Lions are unique among cats in that they live in a group, or pride";
	
		System.out.println("You chose lion with details  as  "+animaltype);
		System.out.println("You chose lion with details  as  "+age);
		System.out.println("You chose lion with details  as  "+hunting_exp);
	}

	
	
	
public void  hunting_details() {
		
	setHunting_exp("Lions prey on a large variety of animals ");
		System.out.println("You chose lion with details  as  "+hunting_exp);
		//return hunt;
		
	}

}
