package learning;

public class Select {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        switch ( a)
        {
            case 10:
                System.out.println("a = 10");
                break;
            case 20:
                System.out.println("a = 20");
                break;
            default:
                System.out.println("a != 10 && a != 20");
        }
    }
}
