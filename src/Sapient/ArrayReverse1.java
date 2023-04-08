package Sapient;

import java.lang.reflect.Array;

/*
Write program to make reverse array. The first line contains an integer,n, denoting the size of the array.
The second line contains space-separated integers representing the array's elements. (input format).
For Example: input array: 12 35 1 10 341
output: 1 34 10 1 35 12
 */
public class ArrayReverse1 {
    public static int[] revArr(String str){
        String[] strArr = str.split(" ");
        int[] intArray = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArray[i] = Integer.parseInt(strArr[i]);
        }

        int[] revArray = new int[intArray.length];
        for (int i =0; i<intArray.length;i++){
            revArray[i] = intArray[intArray.length-1-i];
        }
    return revArray;
    }
    public static void main(String[] args) {
        String int1 = "12 35 1 10 341" ;
        for (int i : revArr(int1)){
            System.out.print(i+" ");
        }
    }
}
