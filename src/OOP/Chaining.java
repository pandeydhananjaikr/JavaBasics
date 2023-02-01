package OOP;

public class Chaining {
	Chaining() {
		this(1.2f);
		System.out.println(" Hi This is non Parameterised");
	}

	Chaining(int a) {
		this(4.4);
		System.out.println(" Hi from para 1 ");
	}

	Chaining(String name) {
		System.out.println("Hi From par 2");
	}

	Chaining(float b) {
		this(2);
		System.out.println("Hi From para 3");
	}

	Chaining(double d) {
		System.out.println("Hi from para 4");
	}

	public static void main(String[] args) {
		Chaining obj = new Chaining();
	
	}
}
