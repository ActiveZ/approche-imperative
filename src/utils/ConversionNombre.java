package utils;

public class ConversionNombre {
    // conversion d'une chaine en entier
    public static int string2int(String s) {
        return Integer.parseInt(s);
    }

    // max entre deux nombres
    public static int max(int a, int b) {
        return Integer.max(a,b);
    }

    public static void main(String[] args) {
        String chaine = "12";
        int i = string2int(chaine);
        System.out.println("Chaine transformée: " + i);
        System.out.println("Max entre 2 et 5: " + max(2,5));
    }
}
