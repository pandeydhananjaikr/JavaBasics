// Hor far a 2 from 1
package Excercise;
public class ArrayChallenge {

    public static void main(String[] args) {
    int[] arr = new int[]{0, 0, 1, 0, 0,0, 2,0,0, 0, 0};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                for (int j = i+1; j < arr.length; j++) { count++;
                    if (arr[j] == 2) {
                        break;
                    }

                }

            }
        }
        System.out.println(count);

}
}
