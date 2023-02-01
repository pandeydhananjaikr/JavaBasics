package Others;

public class SwitchCase {

    public static void sw(int i){
        switch (i) {
            case 0:
                System.out.println("i is zero.");
                break;
            case 1:
                System.out.println("i is one.");
                break;
            case 2:
                System.out.println("i is two.");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
    public static void main(String args[])
    {
        sw(0);
    }
}
