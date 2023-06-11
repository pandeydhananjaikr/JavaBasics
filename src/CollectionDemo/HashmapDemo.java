package CollectionDemo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapDemo {
public static void main(String[] args) {
	
	HashMap<Integer, String> hmap = new HashMap<>();
	hmap.put(1, "1. Dhananjai");
	hmap.put(2, "2. Dhananjai");
	hmap.put(3, "3. Dhananjai");
	hmap.put(4, "4. Dhananjai");
	hmap.put(5, "5. Dhananjai");
	hmap.put(6, "6. Dhananjai");
	hmap.put(7, "7. Dhananjai");

	for (Map.Entry m : hmap.entrySet()) {
		System.out.print(m.getKey()+" "+m.getValue());
	}

}
}
