package CollectionDemo;

import java.util.*;

public class SortAnArray {
    public static void main(String[] args) {

        int [] intArray = {2,4,7,1,10,7,3};
        Arrays.sort(intArray);
        System.out.println(intArray[intArray.length-1]);

//        int intmax=0;
//        int intmin=0;
//
//        for(int i = 0; i<intArray.length; i++){
//            if (intArray[i]<= intmin){
//                intmin = intArray[i];
//            }
//
//            if (intArray[i]>= intmax){
//                intmax = intArray[i];
//            }
//        }
//        System.out.println(intmin);
//        System.out.println(intmax);

    }
}
