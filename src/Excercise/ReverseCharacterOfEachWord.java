package Excercise;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ReverseCharacterOfEachWord {
    public static void main(String[] args) {
        String s = "I am an automation Engineer";
        String [] str = s.split(" ");
        String [] strNew = new String[str.length];
        for (int i = 0; i < str.length; i++) {
        String temp = "";
            for (int j = 0; j <str[i].length() ; j++) {
                temp = temp + str[i].charAt(str[i].length()-1-j);
            }
            strNew[i] = temp;
        }
        for (int i = 0; i < strNew.length; i++) {
            System.out.print(strNew[i]+" ");
        }




//        ArrayList<String> sl = new ArrayList<>();
//
//        for (int i = 0; i < str.length ; i++) {
//            sl.add(str[i]) ;
//        }
//        System.out.println(sl);
    }


}
