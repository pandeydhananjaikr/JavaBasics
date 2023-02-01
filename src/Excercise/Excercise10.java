package Excercise;

import java.util.ArrayList;

public class Excercise10 {
    public static void main(String[] args) {
        ArrayList <String> stringList = new ArrayList<String>();
        ArrayList <Integer> integerList = new ArrayList<Integer>();
        String finalString = "";
        String s = "3[a]2[bc]1[def]";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='['){
                integerList.add(Character.getNumericValue(s.charAt(i-1)));
                String temp = "";
                for (int j = i+1; j < s.length(); j++) {
                    temp = temp+ s.charAt(j);
                    if (s.charAt(j+1)==']'){
                        break;}
                }
                stringList.add(temp);
            }
        }
        for (int i = 0; i < integerList.size(); i++) {
            finalString = finalString+stringList.get(i).repeat(integerList.get(i));
        }
        System.out.println(finalString);
    }
}