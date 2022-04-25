package com.away.DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2022-04-25 20:54
 */
public class RestoreIpAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        LinkedList<String> path = new LinkedList<>();
        backtrack(s,0,path,res);
        return res;
    }
    public void backtrack(String s,int idx,LinkedList<String> path,List<String> res){
        if (path.size()==4){
            res.add(String.join(".",path));
        }
        for (int i = idx; i < s.length(); i++) {
            if (s.length() - i - 1 > 3 * (3 - path.size())) {
                continue;
            }
            if (!isValid(s.substring(idx, i + 1))) {
                continue;
            }
            path.add(s.substring(idx, i + 1));
            backtrack(s, i+1, path, res);
            path.removeLast();
        }
    }
    private boolean isValid(String s) {
        if (s.length() == 0 || s.length() > 4) {
            return false;
        } else if (s.length() > 1 && s.startsWith("0")) {
            return false;
        }else {
            return Integer.parseInt(s)<=255;
        }
    }
}
