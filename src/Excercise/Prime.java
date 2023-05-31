package Excercise;

import java.util.ArrayList;

public class Prime {

    public static void main(String[] args) {
//        int n = 10;
//        int flag;
//        for (int i = 1; i <= n; i++) {
//            if (i==1 || i==0){
//                continue;
//            }
//            flag= 1;
//            for (int j = 2; j <= n/2; j++) {
//                if (i%j==0){
//                    flag = 0;
//                    break;
//                }
//            }
//        if (flag==1){
//            System.out.print(i +" ");
//        }
//        }


        int num =20;
        for(int i=2; i<=num; i++){
            int c = 0;
            for (int j = 2; j <= i/2; j++)
                if (i % j == 0)
                    c++;
            if (c == 0)
                System.out.print(i+ " ");
            else
                continue;
        }










    }
}

