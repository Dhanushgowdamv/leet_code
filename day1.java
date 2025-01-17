class day1 {
    public static boolean palindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev == x;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(4));  // true
        System.out.println(palindrome(121));  // true
        System.out.println(palindrome(-121));  // false
        System.out.println(palindrome(123));  // false
    }
}
