package Excercise;

public class RomanToInteger3 {
    public static void main(String[] args) {
        int temp = 0;
        int total = 0;
        String roman = "CMCDXLXXVIII";

        char[] ch = new char[roman.length()];
        for (int i = 0; i < roman.length(); i++) {
            ch[i] = roman.charAt(i);
        }

        for (int i = 0; i < roman.length(); i++) {
            if (ch[i] == 'C' && ch[i + 1] == 'M') {
                temp = 900;
                i++;
            } else if (ch[i] == 'M') {
                temp = 1000;
            } else if (ch[i] == 'C' && ch[i + 1] == 'D') {
                temp = 400;
                i++;
            } else if (ch[i] == 'D') {
                temp = 500;
            } else if (ch[i] == 'X' && ch[i + 1] == 'C') {
                temp = 90;
                i++;
            } else if (ch[i] == 'C') {
                temp = 100;
            } else if (ch[i] == 'X' && ch[i + 1] == 'L') {
                temp = 40;
                i++;
            } else if (ch[i] == 'L') {
                temp = 50;
            } else if (ch[i] == 'I' && i == roman.length() - 1) {
                temp = 1;
            } else if (ch[i] == 'I' && ch[i + 1] == 'X') {
                temp = 9;
                i++;
            } else if (ch[i] == 'X') {
                temp = 10;
            } else if (ch[i] == 'I' && ch[i + 1] == 'V') {
                temp = 4;
                i++;
            } else if (ch[i] == 'V') {
                temp = 5;
            } else if (ch[i] == 'I') {
                temp = 1;
            }
            total = total + temp;
        }
        System.out.println("Integer = " + total);

    }
}
