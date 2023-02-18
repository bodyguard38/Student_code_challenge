package lesson03;

import java.util.Scanner;

public class Q22_ForLoop {
    public static void main(String[] args) {
          /*
       Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.
       Test Data:
       java is fun
       Beklenen Çıktı:4
          */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen string bir ifade giriniz  : ");
        String metin = scan.nextLine();
        int count = 0;
        for (int i = 0; i <metin.length()-1 ; i++) {
            if (metin.charAt(i) =='a' || metin.charAt(i) =='e' || metin.charAt(i) =='i' ||
                metin.charAt(i) =='o' || metin.charAt(i) =='u' || metin.charAt(i) =='ı' ||
                metin.charAt(i) =='ö' || metin.charAt(i) =='ü')
            count++;
        }
        System.out.println("count = " + count);

    }
}
