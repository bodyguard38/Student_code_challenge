package lesson04;

public class Q13_Arrays {
    public static void main(String[] args) {


        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */

        int [] arr = {1,2,3,4,5,6,7};
        double sum = 0;
        double avg = 0;

        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        avg = sum/arr.length;
        System.out.println("average value is  = " + avg);

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>avg){
                System.out.print(arr[i]+" ");
            }
        }


    }
}
