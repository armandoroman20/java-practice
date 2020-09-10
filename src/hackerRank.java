import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class hackerRank {
    public static void main(String[] args) {
//        int tm;
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of times you want to display 'Stay cool!': ");
//        tm = scanner.nextInt();
//
//        int i = 0;
//
//        while (i < tm){
//            for(i = 0; i<tm ;i++){
//                System.out.print("Stay cool! \n");
//            }
//
//        }
//
//
//        char city [11] = "Las Cruces";
//        System.out.printf("%d \n", strlen(city));


//        for(int i = 1; i <= 100; i++){
//            if(i % 15 == 0){
//                System.out.println("Fizzbuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("fizz");
//            } else if (i % 3 == 0) {
//                System.out.println("buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        for(int i = 1; i <= 100; i++) {
//            String output = "";
//
//            if(i % 3 == 0) { output += "Fizz";}
//            if(i % 5 == 0) { output += "Buzz";}
//
//            if(output.equals("")) { output += i;}
//
//            System.out.println(output);
//        }

        // ==========Hacker Rank==========//


        //        Given an integer, N , perform the following conditional actions:
//
//        If N is odd, print Weird
//        If N is even and in the inclusive range of 2 to 5, print Not Weird
//        If N is even and in the inclusive range of 6 to 20, print Weird
//        If N is even and greater than 20, print Not Weird

//        Scanner scanner = new Scanner(System.in);
//
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//
//        if(N % 2 != 0){
//            System.out.println("Weird");
//        }if((N % 2 == 0) && (N >= 2 && N <= 5)){
//            System.out.println("Not Weird");
//        }if((N % 2 == 0) && (N >= 6 && N <= 20)){
//            System.out.println("Weird");
//        }if((N % 2 == 0) && (N > 20)){
//            System.out.print("Not Weird");
//        }


//        Input Format
//
//        There are three lines of input:
//
//        The first line contains an integer.
//        The second line contains a double.
//                The third line contains a String.
//                Output Format
//
//        There are three lines of output:
//
//        On the first line, print String: followed by the unaltered String read from stdin.
//        On the second line, print Double: followed by the unaltered double read from stdin.
//        On the third line, print Int: followed by the unaltered integer read from stdin.
//        To make the problem easier, a portion of the code is already provided in the editor.
//
//        Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens;
//        because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine()
//        will be reading the remainder of the integer line (which is empty).

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        //========== 2d Array - DS ==========//
//        Given a  2D Array, :
//
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//        An hourglass in  is a subset of values with indices falling in this pattern in 's graphical representation:
//
//        a b c
//          d
//        e f g
//        There are  hourglasses in . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum. The array will always be .
//
//        Example
//
//
//       -9 -9 -9  1 1 1
//        0 -9  0  4 3 2
//       -9 -9 -9  1 2 3
//        0  0  8  6 6 0
//        0  0  0 -2 0 0
//        0  0  1  2 4 0
//        The  hourglass sums are:
//
//        -63, -34, -9, 12,
//        -10,   0, 28, 23,
//        -27, -11, -2, 10,
//          9,  17, 25, 18
//        The highest hourglass sum is  from the hourglass beginning at row , column :
//
//        0 4 3
//          1
//        8 6 6
//        Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.
//
//        Function Description
//
//        Complete the function hourglassSum in the editor below.
//
//        hourglassSum has the following parameter(s):
//
//        int arr[6][6]: an array of integers
//        Returns
//
//        int: the maximum hourglass sum
//        Input Format
//
//        Each of the  lines of inputs  contains  space-separated integers .
//
//                Constraints
//
//        Output Format
//
//        Print the largest (maximum) hourglass sum found in .
//
//        Sample Input
//
        // I goes down, J goes across
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0
//        Sample Output
//
//        19

         class hourglassSolution {

         int hourglassSum ( int[][] arr){

            int rows = arr.length;
            int columns = arr[0].length;

            // this is the smallest possible value based on constraints
            int hour_sum = -63;

            for (int i = 0; i < rows - 2; i++) {
                for (int j = 0; j < columns - 2; j++) {
                    int current_sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                    hour_sum = Math.max(hour_sum, current_sum);
                }
            }

            return hour_sum;
        }
    }

//        Arrays: Left Rotation

         class Solution {

            // Complete the rotLeft function below.
             int[] rotLeft(int[] a, int d) {

                int size = a.length;
                int[] rotated_arr = new int[size];

                int i = 0;
                int rotate = d;

                while (rotate < size) {
                    rotated_arr[i] = a[rotate];
                    i++;
                    rotate++;
                }

                rotate = 0;
                while (rotate < d) {
                    rotated_arr[i] = a[rotate];
                    i++;
                    rotate++;
                }
                return rotated_arr;
            }

        }


        //==========new years chaos==========//

        static void minimumBribes(int[] q) {
            int temp = 0, count = 0, check =0;
            int[] bribe = new int[1000000];
            boolean isSorted = false;
            boolean isGreaterbyTwo = false;
            while(isSorted != true){
                isSorted = true;
                for(int i=q.length-1; i>0 ; --i){
                    if(q[i] < q[i-1]){
                        temp = q[i-1];
                        q[i-1] = q[i];
                        q[i] = temp;
                        bribe[q[i]]++;
                        count++;
                        if(bribe[q[i]] > 2) {
                            System.out.println("Too chaotic");
                            check++;
                            break;
                        }
                        isSorted = false;
                    }
                }
            }
            if(check == 0)
                System.out.println(count);

        }

    }
}
