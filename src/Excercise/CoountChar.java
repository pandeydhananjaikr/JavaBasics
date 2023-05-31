package Excercise;

import java.util.HashMap;

public class CoountChar {
	public static void main(String[] args) {

		String str = "dhananjai";
		char[] ch = str.toCharArray();
	
//		int cnt=0;
//		for (int i = 0; i < ch.length; i++) {
//			for (int j = i+1; j < ch.length; j++) { if (ch[i]==ch[j]) { cnt++; }} System.out.println(""+ch[i]+": "+cnt); }
		
		HashMap <Character,Integer> hmap = new HashMap();
		
		for (char c : ch) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1	);
			}
			else {
				hmap.put(c, 1);
			}
		}
		System.out.println(hmap);
		
		
		
		
		
	}
}
