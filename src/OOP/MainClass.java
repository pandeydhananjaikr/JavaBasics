package OOP;
public class MainClass {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 20;
		p1.name = "Rama";
		Person p2 = new Person();
		p2.age = 30;
		p2.name = "Shyama";
		System.out.println(p1.age + " " + p1.name);
	}
}
class Person {
	String name;
	int age;
}