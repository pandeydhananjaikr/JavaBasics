package Sapient;
/*
Given a list of integers, find out all the even numbers and
sort them in acending order. For example we have input array list
list: 10 15 8 49 25 98 32
output: 8 10 32 98
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<> (Arrays.asList(10,15,8,4, 12, 8,4, 10,11,8));

        List<Integer> newArray =new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            if (!newArray.contains(nums.get(i))){
                newArray.add(nums.get(i));
            }
        }
        System.out.println(newArray);

}

}