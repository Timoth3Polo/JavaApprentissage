public class Exercice1_8 {
    public static void main(String[] args) {
        int i, j;
        double x, y, result;
        
        x = 2;
        y = 3;

        //a
        i = 100 / 6;

        System.out.println("i = " + i);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        //b
        j = 100 % 6;

        System.out.println("j = " + j);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        //c
        i = 5 % 8;

        System.out.println("i = " + i);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        //d
        result = (3 * i - 2 * j) / (2 * x - y);

        System.out.println("result = " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        //e
        result = 2 * ((i/5) + (4 * (j - 3)) % (i + j - 2));

        System.out.println("result = " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        //f
        result = (i - 3 * j) / (x + 2 * y) / (i - j);

        System.out.println("result = " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
    }
}
