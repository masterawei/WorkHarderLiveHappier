package com.away.logic;

/**
 * @author away
 * @date 2021-12-22 20:14
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        int reminder = 0;
        int plus = 0;
        while (len1 >= 0 || len2 >= 0) {
            int n1 = len1>=0?num1.charAt(len1--)-'0':0;
            int n2 = len2>=0?num2.charAt(len2--)-'0':0;
            int sum = plus+n1+n2;
            reminder = sum%10;
            plus = sum/10;
            sb.append(reminder);
        }

        if (plus == 1) {
            sb.append(plus);
        }
        return sb.reverse().toString();

    }
}
