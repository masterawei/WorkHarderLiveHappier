package com.away.logic;

/**
 * @author away
 * @date 2022-04-01 0:32
 */
public class MinimumAddToMakeParenthesesValidSubmissions {
    public int minAddToMakeValid(String s) {
        int need = 0;
        int res = 0;
        for(char c:s.toCharArray()){
            if('('==c){
                need++;
            }
            if(')'==c){
                need--;
                if(need==-1){
                    res++;
                    need=0;
                }
            }
        }
        return need+res;
    }
}
