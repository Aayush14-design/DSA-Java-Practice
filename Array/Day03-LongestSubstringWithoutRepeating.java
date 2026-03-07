/*
Problem: Longest Substring Without Repeating Characters

Description:
Given a string s, find the length of the longest substring 
without repeating characters.

Example:
Input:  s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with length 3.

Approach:
- Start checking substrings from each index.
- Use a boolean visited array to track characters.
- Stop when a duplicate character appears.
- Keep updating the maximum length.

Time Complexity: O(n^2)
Space Complexity: O(256)
*/
public class Main {

    public static void main(String[] args) {

        String s = "abcabcbb";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            boolean visited[] = new boolean[256];
            int count = 0;

            for (int j = i; j < s.length(); j++) {

                char current = s.charAt(j);

                if (visited[current]) {
                    break;
                }

                visited[current] = true;
                count++;
            }

            if (count > maxLength) {
                maxLength = count;
            }
        }

        System.out.println("Longest Substring Length: " + maxLength);
    }
}
