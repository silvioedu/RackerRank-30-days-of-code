package com.silvio.day20;

import java.util.Scanner;

public class Solution {

    public static int checkAndSwap(int a_i, int[] a){
        if(a_i >= 0 && (a_i + 1) < a.length) {

            int nextInt = a[a_i + 1];

            if(a[a_i] > nextInt){
                a[a_i+1] = a[a_i];
                a[a_i] = nextInt;
                return 1+checkAndSwap(a_i-1, a);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }

        int totalSwaps = 0;
        for(int a_i=0; a_i < n; a_i++){
            totalSwaps += checkAndSwap(a_i,a);
        }

        System.out.println("Array is sorted in "+totalSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}