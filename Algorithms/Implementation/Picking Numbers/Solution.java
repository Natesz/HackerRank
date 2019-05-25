import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();  
        int[] array = new int[100];
        
        for(int i:a){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);       
            }else{
                map.put(i,1);
            }
        }
        set = map.keySet();
        for(Integer i:set){
            array[i]=map.get(i);
        }
        int p1=1;
        int max=0;
        
        for(int i=0;i<array.length-1;i++){
            if(array[i]+array[p1]>max){
                max = array[i]+array[p1];
            }
            p1++;
        }
        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
