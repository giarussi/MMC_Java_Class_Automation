package ZooGame;

public class Dog extends animal {

	
	String loyal_dog,age;

	

	public String getLoyal_dog() {
		return loyal_dog;
	}

	public void setLoyal_dog(String loyal_dog) {
		this.loyal_dog = loyal_dog;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}


	public void special_attribute(String loyal_dog) {
		
		setLoyal_dog(loyal_dog);
		loyal_dog="snowy";
		System.out.println("You chose dog with attribute as loyal  ,  "+loyal_dog);
		}

	
public void dog_details() {
	
	age="2";
	loyal_dog="snowy";
		System.out.println("You chose dog with details  as "+loyal_dog);
		System.out.println("You chose dog with details  as "+age);
	}

}


