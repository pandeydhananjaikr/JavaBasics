package Excercise;

import java.util.ArrayList;
import java.util.Arrays;

public class RomanToInteger {
    public static void main(String[] args) {
        int temp=0;
        int total=0;
        String roman = "C";
        String[] romanArray = roman.split("");

        for (int i = 0; i < roman.length(); i++) {
                 if (romanArray[i]=="C" && romanArray[i+1]=="M"){temp = 900; i++;}
            else if (romanArray[i]=="M"){temp = 1000;}
            else if (romanArray[i]=="C" && romanArray[i+1]=="D"){temp = 400; i++;}
            else if (romanArray[i]=="D"){temp = 500;}
            else if (romanArray[i]=="X" && romanArray[i+1]=="C"){temp = 90; i++;}
            else if (romanArray[i]=="C"){temp = 100;}
            else if (romanArray[i]=="X" && romanArray[i+1]=="L"){temp = 40; i++;}
            else if (romanArray[i]=="L"){temp = 50;}
            else if (romanArray[i]=="I" && romanArray[i+1]=="X"){temp = 9; i++;}
            else if (romanArray[i]=="X"){temp = 10;}
            else if (romanArray[i]=="I" && romanArray[i+1]=="V"){temp = 4; i++;}
            else if (romanArray[i]=="V"){temp = 5;}
            else if (romanArray[i]=="I"){temp=1;}

            total = total+temp;
        }
        System.out.println("Integer = "+total);



    }
}
