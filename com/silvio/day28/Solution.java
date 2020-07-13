package com.silvio.day28;


import java.util.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scanner.nextInt();

        String regex = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(regex);

        List<String> list = new ArrayList();

        for (int NItr = 0; NItr < N; NItr++){
            String name = scanner.next();
            String email = scanner.next();

            Matcher matcher = pattern.matcher(email);
            if (matcher.find()){
                list.add(name);
            }
        }

        Collections.sort(list);
        for (String name : list){
            System.out.println(name);
        }

        scanner.close();
    }
}
