package level1;

public class Dog extends Animal {
	private String name;

	public Dog(String racion, String color, int weight, String name) {
		super(racion, color, weight);
		this.name = name;
	}

	public Dog() {
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
		return "Dog [name=" + name + "] " + super.toString();
	}

	@Override
	public String getVoice() {
		return "Woof";
	}

	@Override
	public void eat() {
		System.out.println("Dog " + name + " eat");
	}

	@Override
	public void sleep() {
		System.out.println("Dog " + name + " sleep");
	}
}
