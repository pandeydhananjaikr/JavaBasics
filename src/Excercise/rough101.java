// Hor far a 2 from 1
package Excercise;

import java.util.HashMap;

public class rough101 {
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

//
//        String str = "i am dhananjai kumar pandey";
//        String [] strArray = str.split(" ");
//        String newStr = "";
//
//        for(int i =0; i< strArray.length; i++){
//            for(int j = strArray[i].length()-1; j>=0; j--){
//                newStr = newStr + strArray[i].charAt(j);
//            }
//            newStr = newStr + " ";
//        }
//        System.out.println(newStr);
    }
}