package leetcode_9_palindrome_number;

public class Solution {
    public static boolean isPalindrome(int x) {
        int flag = 0;
        int new_num = 0;
        int ori_num = x;
        
        if (x == 0) {
            return true;
        }
        
        if (x == -2147483648) {
            return false;
        }
        
        flag = (x > 0) ? 1 : -1;
        x = (x > 0) ? x : -x;
        
        while(x > 0) {
            if (new_num * 10 + x % 10 > 2147483647) {
                return false;
            }
            
            new_num = new_num * 10 + x % 10;
            x = x / 10;
        }
        
        if (ori_num == new_num) {
            return true;
        } else {
            return false;
        }
    }
}