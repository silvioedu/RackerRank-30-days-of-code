package com.silvio.day25;

import java.util.*;

public class Solution {

    static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int x = scan.nextInt();
            String s;

            if (x >= 2 && isPrime(x)) s = "Prime";
            else s = "Not prime";

            System.out.println(s);
        }
    }
}
