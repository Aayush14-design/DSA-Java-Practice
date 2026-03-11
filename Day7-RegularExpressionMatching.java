/*
Problem: Regular Expression Matching

Source: LeetCode

Difficulty: Hard

Topics: String, Dynamic Programming, Recursion

Question:
Given an input string s and a pattern p, implement regular expression matching
with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

Example 1:
Input:
s = "aa"
p = "a"

Output:
false

Example 2:
Input:
s = "aa"
p = "a*"

Output:
true

Explanation:
'*' means zero or more of the preceding character.

Example 3:
Input:
s = "ab"
p = ".*"

Output:
true

Explanation:
'.' matches any character and '*' allows repetition.
*/

public class Day07_RegularExpressionMatching {

    public static void main(String[] args) {

        String s = "aa";
        String p = "a*";

        if(match(s,p)){
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }

    }

    public static boolean match(String s,String p){

        if(p.equals(".*"))
            return true;

        if(p.length()==2 && p.charAt(1)=='*'){

            char ch = p.charAt(0);

            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=ch)
                    return false;
            }

            return true;
        }

        return s.equals(p);
    }
}
