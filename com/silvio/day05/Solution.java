package com.silvio.day05;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = "+n*i);
        }

        scn.close();

    }
}
