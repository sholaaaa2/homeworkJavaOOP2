package level1;

public class Animal {
	private String racion;
	private String color;
	private int weight;

	public Animal(String racion, String color, int weight) {
		super();
		this.racion = racion;
		this.color = color;
		this.weight = weight;
	}

	public Animal() {
		super();
	}

	public String getRacion() {
		return racion;
	}

	public void setRacion(String racion) {
		this.racion = racion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [racion=" + racion + ", color=" + color + ", weight=" + weight + "]";
	}

	public String getVoice() {
		return "";
	}

	public void eat() {
		System.out.println("Animal eat");
	}

	public void sleep() {
		System.out.println("Animal sleep");
	}
}
