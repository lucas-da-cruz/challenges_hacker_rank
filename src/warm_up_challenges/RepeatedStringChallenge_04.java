package warm_up_challenges;

import java.io.IOException;

public class RepeatedStringChallenge_04 {
    /**
     * Lilah has a string, , of lowercase English letters that she repeated infinitely many times.
     *
     * Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.
     *
     * For example, if the string  and , the substring we consider is , the first  characters of her infinite string. There are  occurrences of a in the substring.
     *
     * Function Description
     *
     * Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length  in the infinitely repeating string.
     *
     * repeatedString has the following parameter(s):
     *
     * s: a string to repeat
     * n: the number of characters to consider
     * Input Format
     *
     * The first line contains a single string, s.
     * The second line contains an integer, n.
     */
    public static long repeatedString(String s, long n) {
        char letter = 'a';
        long cont = 0;
        long rest = n % s.length();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == letter){
                cont++;
            }
        }
        cont = (n / s.length()) * cont;
        for(int i = 0; i < rest; i++) {
            if(s.charAt(i) == letter){
                cont++;
            }
        }
        return cont;
    }
    
    public static void main(String[] args) throws IOException {
        repeatedString("ceebbcb",817723);
    }
}
