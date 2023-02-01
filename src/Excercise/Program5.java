package Excercise;

public class Program5 {

	public static void main(String[] args) {
		String input = "aaabbaccaeeacffffffcdd";
		int temp = 1;
		System.out.println(input.length());
		for (int i = 0; i < input.length(); i++) {

			if (i == input.length() - 1) {
				System.out.print(input.charAt(i) + "" + temp);
			}

			if (input.charAt(i) == input.charAt(i + 1)) {
				temp++;

			}

			else {
				System.out.print((input.charAt(i) + "" + temp));
				temp = 1;
			}

		}

		// output: a3b2a3c2d1

	}

}
