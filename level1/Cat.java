package level1;

public class Cat extends Animal{
	private String name;

	public Cat(String racion, String color, int weight, String name) {
		super(racion, color, weight);
		this.name = name;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "] " + super.toString();
	}

	@Override
	public String getVoice() {
		return "Myew";
	}

	@Override
	public void eat() {
		System.out.println("Cat " + name + " eat");
	}

	@Override
	public void sleep() {
		System.out.println("Cat " + name + " sleep");
	}
	
}
