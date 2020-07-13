package com.silvio.day08;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> telephone = new HashMap<String,Integer>();

        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            telephone.put(name,phone);
        }

        while(in.hasNext()){
            String s = in.next();
            if (telephone.containsKey(s)){
                System.out.println(s+"="+telephone.get(s));
            } else{
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
