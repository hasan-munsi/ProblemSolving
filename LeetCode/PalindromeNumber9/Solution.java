import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = br.read();
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            boolean stillPalindrome = true;
            StringBuilder number = new StringBuilder(String.valueOf(x));
            for(int i = 0; i<number.length()/2; i++){
                stillPalindrome = number.charAt(i) == number.charAt(number.length()-1-i);
                if(!stillPalindrome){
                    break;
                }
            }
            return stillPalindrome;
        }
    }
}
