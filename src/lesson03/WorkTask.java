package lesson03;

import java.util.Scanner;

import static java.lang.System.in;

public class WorkTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        System.out.println("Lutfen 2 tane isim giriniz");
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        if (name1.length() % 2 == 0) ;
        {
            System.out.println(name1.substring(0, name1.length() / 2) + name2 + name1.substring(name1.length() / 2));
        }
    }
}



