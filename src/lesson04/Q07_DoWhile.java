package lesson04;

import java.util.Scanner;

public class Q07_DoWhile {

    /*
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" yazan programı yazınız.
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     char c;
     do {
         System.out.println("Harf giriniz  :");
         c = sc.next().toLowerCase().charAt(0);
         System.out.println("Program calisiyor");
     }while(c!= 'x');
        System.out.println("Program bitti");
    }
}
