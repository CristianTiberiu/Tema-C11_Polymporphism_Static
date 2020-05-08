package polymorphism_static;

public class Telephone extends Device {
	private boolean hasSlotCard;

	public Telephone(int width, int length, int depth) {
		super(width, length, depth);
	}

	public Telephone(int width, int length, int depth, boolean hasSlotCard) {
		super(width, length, depth);
		this.hasSlotCard = hasSlotCard;
	}

	public void printInfo(boolean hasSlotCard) {
		System.out.println("This phone has Slot Card: " + hasSlotCard);
	}

	public void printInfo(String name, int memoryCapacity) {
		System.out.println("The name of the phone is: " + name + " and the Memory Capacity is " + memoryCapacity);
	}
}
