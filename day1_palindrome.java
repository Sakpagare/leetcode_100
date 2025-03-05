public class day1_palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int n = x;
        int revNum = 0;
        while (n > 0) {
            int d = n % 10;
            revNum = revNum * 10 + d;
            n = n / 10;
        }
        return revNum == x;
    }

    // ✅ Main method added
    public static void main(String[] args) {
        day1_palindrome obj = new day1_palindrome();
        
        int testNumber = 121;  // Change this for testing
        if (obj.isPalindrome(testNumber)) {
            System.out.println(testNumber + " is a palindrome.");
        } else {
            System.out.println(testNumber + " is not a palindrome.");
        }
    }
}

