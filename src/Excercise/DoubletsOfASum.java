package Excercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubletsOfASum {
    public static void main(String[] args) {
    int num = 7;
    int[] numAr = {1,2,3,4,5};
        List<List <Integer>> intList = new ArrayList<>();
        for (int i = 0; i < numAr.length; i++) {
            for (int j = i+1; j <numAr.length ; j++) {
                if (numAr[i]+numAr[j]==num){
                    ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(numAr[i], numAr[j]));
                    intList.add( ar);
                }
            }
        }
        System.out.println(intList);
    }
}