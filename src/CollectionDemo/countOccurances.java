package CollectionDemo;
import java.util.HashMap;
 public class countOccurances {
	public static void main(String[] args) {
		String s = "aaabbbccddeeffffffg";
		HashMap<Character, Integer> hMap = new HashMap<>();
		for (Character ch : s.toCharArray()) {
			if (hMap.containsKey(ch)){
				hMap.put(ch, hMap.get(ch)+1);
			}
			else {
				hMap.put(ch,1);
			}
		}
		System.out.println(hMap);
	}
}
