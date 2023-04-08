package Excercise;
import java.util.LinkedList;

public class ReverseLinkedList {

    public static LinkedList<Integer> rev(LinkedList<Integer> lk) {
        LinkedList<Integer> lkn = new LinkedList<>();
        for (int i = lk.size() - 1; i >= 0; i--) {
            lkn.add(lk.get(i));
        }
        return lkn;
    }

    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        link.add(1); link.add(2); link.add(3); link.add(4); link.add(5);
        System.out.println(rev(link));

    }

}

