public class Exercice1_4 {
    public static void main(String[] args) {
        //1
        int a = 5;
        int b = 7;

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

        //2
        a = 5;
        b = 7;

        b = a;
        a = b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
