package OOP;

public abstract class Animal {
	
	public abstract void sound();
	public abstract void color();
	
	public static void sum() {
		System.out.println("Hello from Abstract Class");
	}
	
	public static void main(String[] args) {
		sum();
	}
	
}
