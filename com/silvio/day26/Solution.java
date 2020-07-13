package com.silvio.day26;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int actualDay   = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear  = sc.nextInt();

        sc.nextLine();

        int expectedDay   = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear  = sc.nextInt();

        int daysDifference   = actualDay - expectedDay;
        int monthsDifference = actualMonth - expectedMonth;
        int yearDifference   = actualYear - expectedYear;

        int fine = 0;
        if      (yearDifference > 0) fine += 10000;
        else if (monthsDifference > 0 && yearDifference == 0) fine += monthsDifference * 500;
        else if (daysDifference > 0 && yearDifference == 0) fine += daysDifference * 15;

        System.out.println(fine);
    }
}
