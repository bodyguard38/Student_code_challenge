package lesson03;

public class Q21_ForLoop {

    //Type all integers which are divisible by 4 and divisible by 6 from 120 to 11
    // in the same line with a space between consecutive integers
    public static void main(String[] args) {

        for (int i = 120; i >11 ; i--) {
            System.out.print(i % 12 == 0 ? i + " " : "");
        }
    }
}
