package lesson03;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {

    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("cumle olustrmak icin 4 kelime giriniz :");
        String w1 = sc.next();
        String w2 = sc.next();
        String w3 = sc.next();
        String w4 = sc.next();
        System.out.println(w1.substring(0,1).toUpperCase() + w1.substring(1) + " " +w2 +" " + w3 + " " + w4 + ".");
    //         ****** While formati ******
    //    Scanner scan = new Scanner(in);
    //    int baslangic = 0;
    //    String str2 = "";
    //    while (baslangic<4) {
    //        System.out.println("Bir kelime gir ");
    //        String str = scan.nextLine();
    //        baslangic++;
    //        str2 = str2 + " "+str;

    //    System.out.println(str2+".");

    }
    }


