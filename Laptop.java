package polymorphism_static;

public class Laptop extends Device {
	private boolean hasMouse;

	public Laptop(int width, int length, int depth) {
		super(width, length, depth);
	}

	public Laptop(int width, int length, int depth, boolean hasMouse) {
		super(width, length, depth);
		this.hasMouse = hasMouse;
	}

	public void printInfo(int length, int depth) {
		System.out.println("This laptop has length: " + length + " and depth " + depth);
	}

	public void printInfo(String name, int bateryCapacity) {
		System.out.println("The name of this laptop is " + name + " and the Batery Capacity is: " + bateryCapacity);
	}

}
