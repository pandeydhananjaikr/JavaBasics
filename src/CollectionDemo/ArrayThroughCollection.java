package CollectionDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayThroughCollection
{
    public static void main(String[] args) {
        String str = "I am Dhananjai Kumar Pandey";

        String [] str1 = str.split(" ");

        ArrayList<String> str2 = new ArrayList<>();
        Collections.addAll(str2, str1);

        System.out.println(str2);

        System.out.println(Collections.max(str2));



        
        




    }


}
