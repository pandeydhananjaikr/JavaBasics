package StringPrograms;

public class StringtoCharArray {
public static void main(String[] args) {
	
	String str = "Dhananjai" ;
	
	 	char [] ch = {};
	
	for (int i = 0; i <= str.length()-1; i++) {
		ch[i] = str.charAt(i);
	}
	
	for (int i = 0; i <= ch.length-1; i++) {
		System.out.print(ch[i]+" ");
	}
	

}
}
