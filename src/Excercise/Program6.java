package Excercise;

import java.util.ArrayList;
import java.util.Iterator;

import StringPrograms.StringtoCharArray;

public class Program6 {
	public static void main(String[] args) {

		String str = "aabaaac";
		char[] c = str.toCharArray();

		// ArrayList <Integer> alist = new ArrayList<>();
		// alist.add(0);

		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;

		for (int i = 0; i < c.length; i++) {
			if (c[i] == c[i + 1]) {
				j++;
			} else {
				break;
			}
		}
		j++;
		System.out.println(j);

		for (int i = j; i < c.length; i++) {
			if (c[i] == c[i + 1]) {
				k++;
			} else {
				break;
			}
		}
		k++;
		System.out.println(k);

		for (int i = j + k; i < c.length; i++) {
			if (c[i] == c[i + 1]) {
				l++;
			} else {
				break;
			}
		}
		l++;
		System.out.println(l);

		for (int i = j + k + l; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				m++;
			} else {
				break;
			}
		}
		m++;
		System.out.println(m);

		System.out.println("" + c[0] + j + c[j] + k + c[j + k] + l + c[j + k + l] + m);

	}
}
