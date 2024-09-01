package dsa.Array;

/*
 * SmallestNumber Whose product of digit is N
 * 
 * Given a positive number N, you need to find the smallest number s such that
 * product of digits of s is equal to N
 * Simple input N =1000;
 * Simple outpur= 5558
 * 
 * 
 * sol
 * Least no of digit
 * digit must be arrange in shorted order
 * range [2-9]
 */
public class SmallestNumber {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(Solution(n));
    }

    public static int Solution(int n) {
        String ans = "";
        for (int div = 9; div >= 2; div--) {
            while (n % div == 0) {
                n = n / div;
                ans = div + ans;
            }
        }
        if (n != 1) {
            return -1;
        } else {
            return Integer.parseInt(ans);
        }
    }
}