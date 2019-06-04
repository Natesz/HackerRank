//https://www.hackerrank.com/challenges/mini-max-sum/problem
//Java 8
//Function Description:
//Complete the miniMaxSum function in the editor below. 
//It should print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) { 
        long min=arr[0];
        long max=arr[0];
        long sum = 0;
        for(int i: arr){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
            
            sum = sum + i;
        }
        
       System.out.println((sum-max) + " " + (sum-min)); 


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
