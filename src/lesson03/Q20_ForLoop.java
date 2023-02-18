package lesson03;

import java.util.Scanner;

public class Q20_ForLoop {

    // Kullanicidan iki sayi isteyin.
    // Girilen sayilar ve aralarindaki tum
    // tamsayilari toplayip, sonucu yazdiran bir program yaziniz
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen bir sayı giriniz  :");
        int sayi1=scan.nextInt();
        System.out.print("Lutfen bir sayı giriniz  :");
        int sayi2=scan.nextInt();
        int toplam=0;

        for (int i = sayi1<sayi2 ?sayi1:sayi2 ; i <= (sayi1>sayi2? sayi1 :sayi2) ;i++) {
            toplam+=i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("toplam = " + toplam);
    }
}
