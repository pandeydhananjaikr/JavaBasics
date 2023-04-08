package CollectionDemo;

import java.util.Arrays;

public class SortAnArray1 {
    public static void main(String[] args) {

        int [] intArray = {0,0,1,1,0,1,0};
        int [] newIntArray = new int[intArray.length];

        int j = 0;
        int k = intArray.length-1;
        for (int i = 0; i<intArray.length; i++){

            if (intArray[i]==0){
                newIntArray[j]= 0;
                j++;
            }

            if (intArray[i]==1){
                newIntArray[k]=1;
                k--;
            }
        }
        for (int i : newIntArray) {
            System.out.print(i+ " ");
        }





    }
}
