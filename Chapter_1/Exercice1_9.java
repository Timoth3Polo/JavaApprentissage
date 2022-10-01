public class Exercice1_9 {
    public static void main(String[] args) {
        int n, p, r, s, t;
        float x, result;

        n = 10;
        p = 7;
        r = 8;
        s = 7;
        t = 21;

        x = 2.0f;

        //a
        result = x + n % p;
        
        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        result = x + n / p;

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        result = (x + n) / p;

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        result = 5.0f * n;

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        result = (n + 1) / n;

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        result = (n + 1.0f) / n;

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        result = r + s / t;

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        //b
        result = r + t / s;

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        result = (r + t) / s;

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        result = r + t % s;

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        result = (r + t) % s;

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        result = r + s / r + s;

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        result = (r + s) / (r + s);

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        result = r + s % t;

        System.out.println("result: " + result);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
    }
}
