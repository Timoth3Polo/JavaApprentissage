public class Exercice1_10 {
    public static void main(String[] args) {
        int valeur, chiffre, i1, i2;
        float f1, f2;

        valeur = 7;
        chiffre = 2;

        i1 = valeur / chiffre;
        i2 = chiffre / valeur;
        f1 = (float) (valeur / chiffre);
        f2 = (float) (valeur / chiffre) + 0.5f;
        i1 = (int) f1;
        i2 = (int) f2;
        f1 = (float) valeur / (float) chiffre;
        f2 = (float) valeur / (float) chiffre + 0.5f;
        i1 = (int) f1;
        i2 = (int) f2;

        System.out.println("valeur = " + valeur);
        System.out.println("chiffre = " + chiffre);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
    }
}
