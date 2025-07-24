package Tries;

class TrieNode {
    TrieNode[] child = new TrieNode[26];
    boolean isEnd = false;
}


public class Insertion {
    public static void  insert(TrieNode root, String s) {
        TrieNode curr = root;
        for(int i = 0; i<s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if(curr.child[idx] == null) {
                curr.child[idx] = new TrieNode();
            }
            curr = curr.child[idx];
        }
        curr.isEnd = true;
    }

    public static boolean search(TrieNode root, String word) {
        TrieNode curr = root;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }
        return curr.isEnd;
    }

    public static boolean startsWith(TrieNode root, String prefix) {
        TrieNode curr = root;
        for(int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if(curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }
        // if(curr.isEnd == true) return false;
        return true;
    }

    public static void print(TrieNode root) {
        printAllWords(root, "");
    }

    public static void printAllWords(TrieNode root, String s) {
        if(root == null) return;

        if(root.isEnd) {
            System.out.println(s);
        }

        for(int i=0; i<26; i++) {
            if(root.child[i] != null) {
                char c = (char)(i+'a');
                printAllWords(root.child[i], s + c);
            }
        }
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        insert(root, "anvesh");
        insert(root, "anvv");
        System.out.println(startsWith(root, "anv"));
        // System.out.println(search(root, "anvesh"));
        print(root);
    }
}
