// Hor far a 2 from 1
package Excercise;

import java.util.HashMap;

public class OccurancesOfCharacters {
    public static void main(String[] args) {

        String str = "I am Dhananjai Kumar Pandey";
        HashMap<Character, Integer> hMap = new HashMap<>();

        for(Character ch: str.toCharArray()){

            if(hMap.containsKey(ch)){
                hMap.put(ch, hMap.get(ch)+1);
            }
            else {
                hMap.put(ch,1);
            }
        }
        System.out.println(hMap);
    }
}