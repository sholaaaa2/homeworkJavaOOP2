package level1;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat("meat", "black", 5, "Boris");
		Veterinarian vt = new Veterinarian("Jhon");
		
		System.out.println(cat.getVoice());
		cat.eat();
		cat.sleep();
		
		vt.treatment(cat);
	}

}
