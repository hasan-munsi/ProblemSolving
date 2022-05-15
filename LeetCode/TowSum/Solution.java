import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String[] numbersArrStr = bufferedReader.readLine().replaceAll("\\[", "").replaceAll("]", "").split(",");
            int[] num = new int[numbersArrStr.length];
            for(int i = 0; i<numbersArrStr.length; i++){
                num[i] = Integer.parseInt(numbersArrStr[i]);
            }
            System.out.print(" ");
            int sum = Integer.parseInt(bufferedReader.readLine().trim());
            int[] result = twoSum(num, sum);
            System.out.println("" + "[" + result[0] + "," + result[1] + "]");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int[] twoSum(int[] numbers, int target){
        int[] pairs = new int[2];
        for(int i = 0; i<numbers.length; i++){
            long firstNumber = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                long secondNumber = numbers[j];
                if(firstNumber+secondNumber==target){
                    pairs[0] = i;
                    pairs[1] = j;
                    break;
                }
            }
        }
        return pairs;
    }
}
