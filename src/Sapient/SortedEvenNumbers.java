package Sapient;
/*
Given a list of integers, find out all the even numbers and
sort them in acending order. For example we have input array list: 10 15 8 49 25 98 32
output: 8 10 32 98
 */

import java.util.*;

public class SortedEvenNumbers {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<> (Arrays.asList(10,15,8,49,25,98,32));

        for (int i = 0; i < intList.size(); i++) {

            if (intList.get(i)%2==0){
                intList.remove(i);
            }
        }

        Collections.sort(intList);
//        for (int i = 0; i < intList.size()-1; i++) {
//            if (intList.get(i)>intList.get(i+1)){
//                a = intList.get(i);
//                intList.set(i, intList.get(i+1)) ;
//                intList.set(i+1, a);
//            }
//        }
        System.out.println(intList);
    }
}
