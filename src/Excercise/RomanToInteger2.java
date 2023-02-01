package Excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class RomanToInteger2 {
    public static void main(String[] args) {
        int temp=0;
        int total=0;
        String roman = "LVIII";
        String[] romanArray = roman.split("");

        LinkedList<String> arrlist = new LinkedList<>(Arrays.asList(romanArray));

        for (int i = 0; i < arrlist.size(); i++) {
            if (arrlist.get(i)=="C" && arrlist.get(i+1)=="M"){temp = 900; i++;}
            else if (arrlist.get(i)=="M"){temp = 1000;}
            else if (arrlist.get(i)=="C" && arrlist.get(i+1)=="D"){temp = 400; i++;}
            else if (arrlist.get(i)=="D"){temp = 500;}
            else if (arrlist.get(i)=="X" && arrlist.get(i+1)=="C"){temp = 90; i++;}
            else if (arrlist.get(i)=="C"){temp = 100;}
            else if (arrlist.get(i)=="X" && arrlist.get(i+1)=="L"){temp = 40; i++;}
            else if (arrlist.get(i)=="L"){temp = 50;}
            else if (arrlist.get(i)=="I" && arrlist.get(i+1)=="X"){temp = 9; i++;}
            else if (arrlist.get(i)=="X"){temp = 10;}
            else if (arrlist.get(i)=="I" && arrlist.get(i+1)=="V"){temp = 4; i++;}
            else if (arrlist.get(i)=="V"){temp = 5;}
            else if (arrlist.get(i)=="I"){temp=1;}

            total = total+temp;
        }
        System.out.println("Integer = "+total);



    }
}
