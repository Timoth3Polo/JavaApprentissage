public class Exercice1_6 {
    public static void main(String[] args) {
        int a, b, c, tmp;

        a = 1;
        b = 2;
        c = 3;

        System.out.println("Base : \na = " + a + 
            "\nb = " + b + 
            "\nc = " + c);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        tmp = a;
        a = b;
        b = c;
        c = tmp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
