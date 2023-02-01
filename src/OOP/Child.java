package OOP;

public class Child extends Parent {
	int age = 10;
	String name = "Shaktiman";
	
	public void eat() {
		System.out.println("I eat Chocolates");
	}
	
	
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.eat();c1.printDetails();
		System.out.println(c1.age);
	}
	

}
