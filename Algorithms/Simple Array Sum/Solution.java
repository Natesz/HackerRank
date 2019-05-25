//Problem: https://www.hackerrank.com/challenges/simple-array-sum/problem
//Java 8

import java.util.*;

public class Solution {

    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=0;

        for(int i=0;i<n;i++){
            int a = scanner.nextInt();
            sum = sum + a;
        }
       
        System.out.println(sum);

    }
}

