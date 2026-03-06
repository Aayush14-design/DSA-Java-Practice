/*
Problem: Add Two Numbers

Platform: LeetCode

Difficulty: Medium

Question:
You are given two non-empty arrays representing two non-negative integers.
The digits are stored in reverse order, and each of their elements contains a single digit.
Add the two numbers and return the result as an array in reverse order.

Example:
Input:
a = [2,4,3]
b = [5,6,4]

Explanation:
342 + 465 = 807

Output:
[7,0,8]
*/

public class Day02_AddTwoNumbers {

    public static void main(String[] args) {

        int a[] = {2,4,3};
        int b[] = {5,6,4};

        String A = "" + a[2] + a[1] + a[0];
        String B = "" + b[2] + b[1] + b[0];

        int A1 = Integer.parseInt(A);
        int B1 = Integer.parseInt(B);

        int sum = A1 + B1;

        int r = 0;
        int rev = 0;

        while(sum > 0){
            r = sum % 10;
            rev = rev * 10 + r;
            sum = sum / 10;
        }

        String num = "" + rev;

        System.out.println("Output: [" + num.charAt(0) + "," + num.charAt(1) + "," + num.charAt(2) + "]");
    }
}
