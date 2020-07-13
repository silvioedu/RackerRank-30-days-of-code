package com.silvio.day06;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        for(int j = 0; j < N; j++){
            String string = in.nextLine();
            char[] charArray = string.toCharArray();

            String even = new String();
            String odd = new String();
            for (int i = 0; i < charArray.length; i++) {
                if (i % 2 == 0) {
                    even += charArray[i];
                } else {
                    odd += charArray[i];
                }
            }
            System.out.print(even+" "+odd+"\n");
        }

        in.close();
    }
}
