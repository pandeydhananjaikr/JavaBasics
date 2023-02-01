package Excercise;

import java.util.ArrayList;

public class Program10 {
	public static void main(String[] args) {

		String s = "aaabdhkkkllldddd";
		char[] ch = s.toCharArray();

		//System.out.println(ch.length);
		for (int i = 0; i < ch.length; i++) {
			int temp = 1;
			while (ch[i]==ch[i+1]){
				i++;
				temp = temp+1;
			if (i == ch.length-1){
				break;
			}
			}
			System.out.print(ch[i]+""+ temp );
		}

	}
}
