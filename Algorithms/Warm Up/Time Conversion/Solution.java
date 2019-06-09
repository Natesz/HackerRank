//Time Conversion
//Java 8
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        
        String hour = s.substring(0,2);
        Integer intHour =0;
        intHour = intHour.parseInt(hour);
      
        if(s.substring(0,2).equals("12") && s.substring(s.length()-2).equals("AM")){
            return "00" + s.substring(2,8);    
           
        }
        if(s.substring(0,2).equals("12") && s.substring(s.length()-2).equals("PM")){
            return s.substring(0,8);
        }
        
        if(s.substring(s.length()-2).equals("AM")){
            return s.substring(0,8);
        }else{
            return (intHour+12) + s.substring(2,8);
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
