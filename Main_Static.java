package polymorphism_static;

public class Main_Static {
	public static void main(String[] args) {
		
		Telephone Alex = new Telephone(8, 6, 4, false);
		
		Alex.printInfo("Iphone");
		Alex.printInfo(4);
		Alex.printInfo("Samsung", 1024);
		
		Laptop work = new Laptop(23, 34, 6);
		
		work.printInfo(12, 32);
		work.printInfo("Asus");
		work.printInfo("LG", 100);
	}
}
