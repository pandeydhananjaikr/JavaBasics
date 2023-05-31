package Excercise;
import java.util.LinkedList;
public class LengthLastWord {
    public static void main(String[] args) {
        String str = "My name is Dhananjai";
        String[] strArray = str.split(" ");
        System.out.println(strArray[strArray.length - 1].length());

    }
}

