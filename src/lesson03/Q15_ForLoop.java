package lesson03;

public class Q15_ForLoop {
        //Interview Question
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
        public static void main(String[] args) {

            System.out.println("***while ile***");
            int x =0;
            while (x<=255){
                char k = (char) x;
                System.out.println(x + "->" + k);
                x++;
            }
            System.out.println("***do while ile***");


        }

}
