package OOP;

public class Cat extends Animal{

	
	public void sound() {
		System.out.println("meow........");
	}


	public void color() {
		System.out.println("Black");
	}
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.color();
		c1.sound();
		
		
	}
	
	

}
