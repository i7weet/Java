package lr6;

import java.util.Scanner;

    public class Timus1123 {
        public static void main(String[] args)
        {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите заработную плату сотрудника: ");
        String salary = scanner.nextLine().trim();
        String result = NextPalindrome(salary);
        System.out.println(result);
}
    private static String NextPalindrome(String s) {
        int n = s.length();
        if (IsPalindrome(s)) {
            return s;
        }
        String leftHalf = s.substring(0, (n + 1) / 2);
        String palindrome = CreatePalindrome(leftHalf, n % 2 == 0);
        if (palindrome.compareTo(s) >= 0) {
            return palindrome;
        }
        String incrementedLeftHalf = Increment(leftHalf);
        return CreatePalindrome(incrementedLeftHalf, n % 2 == 0);
    }

    private static boolean IsPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    private static String CreatePalindrome(String half, boolean isEven) {
        StringBuilder palindrome = new StringBuilder(half);
        if (isEven) {
            palindrome.append(new StringBuilder(half).reverse());
        } else {
            palindrome.append(new StringBuilder(half).reverse().substring(1));
        }
        return palindrome.toString();
    }

    private static String Increment(String s) {
        StringBuilder incremented = new StringBuilder(s);
        int carry = 1, i = incremented.length() - 1;

        while (i >= 0 && carry > 0) {
            int digit = incremented.charAt(i) - '0' + carry;
            if (digit == 10) {
                incremented.setCharAt(i, '0');
                carry = 1;
            } else {
                incremented.setCharAt(i, (char) (digit + '0'));
                carry = 0;
            }
        }

        if (carry > 0) {
            incremented.insert(0, '1');
        }
        return incremented.toString();
    }
}
