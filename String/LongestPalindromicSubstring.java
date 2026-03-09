/*
Problem: Longest Palindromic Substring

Platform: LeetCode

Difficulty: Medium

Question:
Given a string s, return the longest palindromic substring in s.

Example:
Input: s = "babad"
Output: "bab" or "aba"

Explanation:
Both "bab" and "aba" are valid palindromes.
*/

public class Day05_LongestPalindromicSubstring {

    public static void main(String[] args) {

        String s = "babad";
        String longest = "";

        for(int i = 0; i < s.length(); i++) {

            for(int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);

                if(isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }

            }
        }

        System.out.println("Longest Palindrome: " + longest);
    }

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {

            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
