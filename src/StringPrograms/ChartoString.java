package StringPrograms;

public class ChartoString {
public static void main(String[] args) {
	char[] str = {'D','h','D','h'};
	
	String str1 = "" ;
	for (int i = 0; i <= str.length-1; i++) {
		str1 = str1 + str[i];
	}
	System.out.println(str1);
	
	

}
}
