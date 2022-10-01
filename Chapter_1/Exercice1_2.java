public class Exercice1_2 {
    public static void main(String[] args) {
        //A
        float A = 3.5f;
        float B = 1.5f;
        float C;
        
        C = A + B;
        System.out.println("C = " + C);

        B = A + C;
        System.out.println("B = " + B);

        A = B;
        System.out.println("A = " + A);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        
        //B
        double D = 0.1;
        double E = 1.1;
        double F, G;

        E = D;
        F = E;
        G = F;
        D = G;

        System.out.println("D = " + D);
        System.out.println("E = " + E);
        System.out.println("F = " + F);
        System.out.println("G = " + G);
    }
}