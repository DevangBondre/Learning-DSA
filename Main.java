import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.sort;
import static java.util.Collections.swap;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Please enter the no u want check : ");
//        int num = in.nextInt();
//
//
//        System.out.println(isPrime(num));
//
//
//    }
//
//     static boolean isPrime(int num) {
//
//        if (num<=1){
//            return false;
//        }
//         int count=2;
//        while (count*count <= num){
//            if (num%count==0){
//                return false;
//            }
//            count++;
//        }
//        if (count * count > num){
//            return true;
//
//        }
//        return false;
//    }
//}

           /// armstrong no these no have the sum of their individual deigits cum equal to the no
     // eg - 153 - 1 cube + 5 cube + 3 cube = 153



//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("Please enter the  no u wanna check ");
//       Scanner in = new Scanner(System.in);
//       int num =in.nextInt();
//        System.out.println(isArmstrong(num));
//    }
//
//    static boolean isArmstrong(int num){
//
//        int original =num;
//        int sum =0;
//        while (num>0){
//            int rem = num%10;
//            num = num/10;
//         sum = sum + rem*rem*rem;
//        }
//        if (sum==original){
//            return true;
//
//        }
//        else {
//            return false;
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        String[] arr = {"2","4","10"};
//        System.out.println(arr[1]);
//    }
//
//}




     // Printing a 3 * 3 matrix

//public class Main {
//    public static void main(String[] args) {
//        /*
//        2 3 4
//        4 5 1
//        33 0 4
//         */
//        Scanner in = new Scanner(System.in);
//
//        int[][] arr = new int[3][3];
//        for (int row = 0; row < 3; row++) {
//
//
//            for (int col = 0; col < 3; col++) {
//                arr[row][col] = in.nextInt();
//            }
//
//        }
//        for (int row = 0; row < 3; row++) {
//
//
//            for (int col = 0; col < 3; col++) {
//
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//        }
//    }
//}

//public class Main {
//    public static void main(String[]arg){
//        Scanner in = new Scanner(System.in);

        // array list

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(33);
//        list.add(44);
//        list.add(66);
//        list.add(0);
//        list.add(31);
//        System.out.println("Input the no u wanna add : ");
//        list.add(in.nextInt());
//
//        System.out.println(list);
//}
//}




        // swaping two numbers from an array
//public class Main {
//    public static void main(String[] args) {
//
//        // swap two numbers from a array
//
//        int[] arr = {1, 6, 7, 2, 3, 0};
//        swap(arr,1,4);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void swap(int[]arr , int index1,int index4){
//        int temp = arr[index1];
//        arr[index1]= arr[index4];
//        arr[index4] = temp;
//
//    }
//}




            // finding max no in an array
//public class Main{
//    public static void main(String[]args){
//        Scanner in = new Scanner(System.in);
//        int[] arr = {2,5,6,7,11,1,18,99,56};
//        System.out.println(max(arr));
//    }
//    static int max(int[]arr){
//        int max = arr[0];
//        for (int i = 1; i <arr.length ; i++) {
//            if (arr[i]>max){
//                max=arr[i];
//            }
//
//        }
//        return max ;
//    }
//}




          // reversing array using two pointer method and all these crap of multiple static void functions
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {2,5,6,7,11,1,18,99,56};
//
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void reverse(int[]arr) {
//        int start = 0;
//        int end = arr.length-1;
//        while(start<end){
//            swap(arr,start, end);
//            start++;
//            end--;
//
//        }
//    }
//
//    static void swap(int[] arr, int i, int j) {
//        int temp =  arr[i ];
//        arr[i] = arr[j];
//        arr[j] = temp;
//
//    }
//}





           // reversing array in like same class and stuff kinda easy
//public class Main{
//    public static void main(String[]args){
//        int[] arr = {1,42,6,2,77,90,11};
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start<end) {
//
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr));
//
//    }
//}


public class Main{
    public static void main(String[] args) {
        String[] arr ={"h","e","l","l","o"};
        int start = 0 ;
        int end = arr.length-1;

        while(start<end){
            String temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
    }
}