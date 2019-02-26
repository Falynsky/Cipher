/*
 * Program szyfruje text szyfrem cezara
 * zakladam że jedyne znaki ktore mozna wprowadzic to duże litery alfabetu polskiego i spacja
 * spacja zostaje sapcja a litery sa szyfrowane
 */

public class Main{

    public static void main(String[] args) {

        Cipher cezar = new Cipher();
        System.out.println(cezar.encrypt(3,"abc"));
        System.out.println(cezar.decrypt(3,"cde"));

        System.out.println(cezar.encrypt(3,"aąbcćzżź"));
        System.out.println(cezar.decrypt(3,"cćdefabą"));

    }
}