package Excercise;

public class ReverseEachWordInString {
    public static void main(String[] args) {

        String str = "i am dhananjai kumar pandey";
        String [] strArray = str.split(" ");
        String newStr = "";

        for(int i =0; i< strArray.length; i++){
            for(int j = strArray[i].length()-1; j>=0; j--){
                newStr = newStr + strArray[i].charAt(j);
            }
            newStr = newStr + " ";
        }
        System.out.println(newStr);
    }
}