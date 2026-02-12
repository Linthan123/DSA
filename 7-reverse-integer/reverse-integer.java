class Solution {
    public int reverse(int x) {
        long rev = 0;

        while(x != 0){
            long digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;

            // Did the reversed number exceed 32-bit limits?([-2147483648, 2147483647])
            // If yes → return 0 immediately, as required
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){ //
                return 0;
            }
        }
        return (int)rev;
    }
}