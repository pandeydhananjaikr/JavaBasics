//Find the second most repeated character in the string

package Excercise;

import java.util.HashSet;
import java.util.Iterator;

import StringPrograms.StringtoCharArray;

public class Program2 {
	public static void main(String[] args) {
		String str = "aabbaaac";

		char[] c = str.toCharArray();

		HashSet<Character> hs = new HashSet<>();

		for (int i = 0; i < c.length; i++) {
			hs.add(c[i]);
		}
		System.out.println(hs);

//	for (int i = 0; i < c.length; i++) {
//		for (int j = 0; j < hs.size(); j++) {
//			while (hs.hasNext()) {

		// }
		// }
		// }

	}
}
