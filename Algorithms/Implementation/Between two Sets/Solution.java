import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */
        Set<Integer> set = new HashSet<Integer>();
        int aMax = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>aMax){
                aMax = a[i];
            }
        }
        
        System.out.println(aMax);
        
        
        int bMin = b[0];
        for(int i=0;i<b.length;i++){
            if(b[i]<bMin){
                bMin = b[i];
            }
        }
        
        System.out.println(bMin);
        
        for(int i=aMax;i<=bMin;i++){
            boolean isOszto = true;
            for(int j: a){
                if(i%j!=0){
                    isOszto = false;
                }
            }
            if(isOszto){
                System.out.println(i);
                set.add(i);
            }
            
        }
        int count=0;
        
        for(int i:set){
            boolean isOsztja = true;
            for(int j:b){
                if(j%i!=0){
                    isOsztja = false;
                }
            }
            if(isOsztja){
                count++;
            }
        }
        return count;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}