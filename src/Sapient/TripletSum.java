package Sapient;

import java.util.Scanner;

public class TripletSum {
    public static int tripletSum(int[] arr, int x) {
        int numberPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        numberPairs++;
                    }
                }
            }
        }
        return numberPairs;
    }


    public static void main(String[] args) {
        int[] arr = {1,4,5,2,6,2};
        int x = 10;
        System.out.println(tripletSum(arr, x));

        }
    }
