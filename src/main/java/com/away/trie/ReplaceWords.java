package com.away.trie;

import java.util.List;

/**
 * @author away
 * @date 2022-07-07 13:57
 */
public class ReplaceWords {
    class Node {
        Node[] nodes;
        boolean isEnd;

        public Node() {
            nodes = new Node[26];
        }
    }
    Node root = new Node();
    public void add(String words) {
        Node node = root;
        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            int idx = ch-'a';
            if (node.nodes[idx] == null) {
                node.nodes[idx] = new Node();
            }
            node = node.nodes[idx];
        }
        node.isEnd=true;
    }

    String query(String s) {
        Node p = root;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';
            if (p.nodes[ch] == null) break;
            if (p.nodes[ch].isEnd) return s.substring(0, i + 1);
            p = p.nodes[ch];
        }
        return s;
    }
    public String replaceWords(List<String> ds, String s) {
        for (String str : ds) add(str);
        StringBuilder sb = new StringBuilder();
        for (String str : s.split(" ")) sb.append(query(str)).append(" ");
        return sb.substring(0, sb.length() - 1);
    }
}
