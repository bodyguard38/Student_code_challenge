package lesson04;

import java.util.Scanner;

public class Q04_WhileLoop {

    /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = scanner.nextInt();

        int counter = 0;

        while (sayi > 0) {
            if (sayi % 2 == 1) {
                System.out.print(sayi +" ");
                counter++;
            }
            sayi--; // butun sayilara bakmasi icin
        }
        System.out.println();
        System.out.println("counter = " + counter);
    }
}
