package polymorphism_static;

public class Device {
	final int width;
	final int length;
	final int depth;

	public Device(int width, int length, int depth) {
		this.width = width;
		this.length = length;
		this.depth = depth;
	}

	public void printInfo(String name) {
		System.out.println("The name of device is: " + name);
	}

	public void printInfo(int width) {
		System.out.println(this.width);
	}

}
