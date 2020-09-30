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
    public static int birthdayCakeCandles(List<Integer> candles) {
        Arrays.sort(ar);
        int candles = 0, longest = ar[ar.length-1];
        for(int i = ar.length-1; i >= 0; i--){
            if(longest == ar[i]){
                candles = candles + 1;
            }else{
                break;
            }
        }
        return candles;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


// public class Solution {
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         ArrayList<Integer> al=new ArrayList<Integer>();
//         for(int i=0;i<n;i++) al.add(scan.nextInt());
//         System.out.println(Collections.frequency(al,Collections.max(al,null)));
//     }
// }
