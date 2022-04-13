package com.away.logic;

/**
 * @author away
 * @date 2022-04-13 20:37
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
    String[] map  ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < map.length; i++) {
        while (num - val[i] >= 0) {
            sb.append(map[i]);
            num-=val[i];
        }
    }
    return sb.toString();
}
}
