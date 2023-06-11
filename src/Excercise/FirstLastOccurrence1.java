package Excercise;
import java.util.ArrayList;

public class FirstLastOccurrence1 {

    public void getIndex(int num, int[] intArray){

        ArrayList<Integer> intList = new ArrayList<>();
        int count ;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]==num){
                intList.add(i);
            }
        }
        System.out.println("The first occurrence of "+num+" is "+intList.get(0)+
                " And the last occurrence is "+intList.get(intList.size()-1));
        System.out.println(intList);
    }
    public static void main(String[] args) {
    new FirstLastOccurrence1().getIndex(3,new int[]{1,2,3,4,5,3,7,8,3,9});
    }
}


