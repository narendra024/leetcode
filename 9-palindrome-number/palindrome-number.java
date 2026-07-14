class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int copy = x;
        int result = 0;

        while (x != 0) {
            int temp = x % 10;
            x /= 10;

            result = result * 10 + temp;
        }

        return result == copy;
    }
}