public class Exercice1_7 {
    public static void main(String[] args) {
        int a, b;

        a = 1;
        b = 2;

        System.out.println("Base : \na = " + a + 
            "\nb = " + b);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
