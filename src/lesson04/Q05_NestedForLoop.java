package lesson04;

import java.util.Scanner;

public class Q05_NestedForLoop {

    /*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.

    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       *****
*/
    public static void main(String[] args) {
        int i, j, k;
        for(i=1; i<=5; i++)
        {
            for(j=5; j>i; j--)
                System.out.print(" ");
            for(k=1; k<=i; k++)
                System.out.print("*");
            System.out.println();
    }
    }
}