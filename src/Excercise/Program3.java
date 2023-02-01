//find the element in Array whose sub array of 2 sums 13 --> [9,4,10,1,3,10,2,4,5,6,9,11]
package Excercise;

public class Program3 {
	public static void main(String[] args) {

		int[] arr1 = { 10, 4, 10, 1, 3, 10, 2, 4, 5, 6, 9, 11 };
		//int count = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] + arr1[j] == 13) {
					System.out.println("(" + arr1[i] + "," + arr1[j] + ")");
		//			count++;
				}
			}
		}
	}
}
