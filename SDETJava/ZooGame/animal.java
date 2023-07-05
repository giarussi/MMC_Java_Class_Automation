package ZooGame;

public class animal {

	

		String  animalid,animaltype;
		
	public String getAnimalid() {
			return animalid;
		}

		public void setAnimalid(String animalid) {
			this.animalid = animalid;
			System.out.println("animal id  := " +animalid);
		}

		public String getAnimaltype() {
			return animaltype;
		}

		public void setAnimaltype(String animaltype) {
			this.animaltype = animaltype;
		}

	public animal() {
			
			System.out.println("animal constructor");
			this.animalid=animalid;
			this.animaltype=animaltype;
			
		}



}
