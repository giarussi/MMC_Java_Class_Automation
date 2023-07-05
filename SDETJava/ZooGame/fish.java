package ZooGame;

public class fish extends Lion {

	static String color;
	String type;
	static int fish_col=50;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public fish(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}
	
public void dog_details() {
		
	animaltype="aquatic vertebrates";
	color="Golden";
	type="gill-bearing";
		System.out.println("You chose Fish  with details as "+animaltype);
		System.out.println("You chose Fish with details  as "+color);
		System.out.println("You chose Fish with details  as "+type);
	}


public static int fish_color( String colr){
	
	System.out.println("You chose fish  with color ");
	if (colr.equalsIgnoreCase("Blue")) {
		System.out.println("You chose fish  with color Blue"+colr);
		
			return fish_col;
	}
	else {
		System.out.println("You chose fish  with another color "+colr);
		fish_col=0;
		return fish_col;
	}
}
}


