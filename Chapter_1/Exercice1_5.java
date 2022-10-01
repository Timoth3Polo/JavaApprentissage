public class Exercice1_5 {
    public static void main(String[] args) {
        int a, b, t;

        a = 10;
        b = 5;

        System.out.println("Base : \na = " + a + "\nb = " + b);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        a = b;
        b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        a = 10;
        b = 5;

        t = a;
        a = b;
        b = t;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("t = " + t);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        a = 10;
        b = 5;

        t = a;
        b = a;
        t = b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("t = " + t);
    }
}
