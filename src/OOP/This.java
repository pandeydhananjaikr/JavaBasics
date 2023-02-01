package OOP;
public class This {
	static {
		System.out.println("a");
	}
	public static void main(String[] args) {
		try {
		} finally {
			System.out.println('c');
		}
		System.out.println("b");
	}
}