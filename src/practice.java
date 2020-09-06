import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class practice {
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

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        if(N % 2 != 0){
            System.out.println("Weird");
        }if((N % 2 == 0) && (N >= 2 && N <= 5)){
            System.out.println("Not Weird");
        }if((N % 2 == 0) && (N >= 6 && N <= 20)){
            System.out.println("Weird");
        }if((N % 2 == 0) && (N > 20)){
            System.out.print("Not Weird");
        }
    }
}
