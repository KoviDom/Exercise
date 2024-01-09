public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int original = number;
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return reverse == number;
    }

//    public static boolean isPalindrome(int number){
//
//        //declaring a number to store the reverse
//        int reverse = 0;
//
//        //declaring original number to keep track of the number after looping
//        int originalNumber = number;
//
//        //boolean to store the results
//        boolean palindrome = true;
//
//        while (number > 0 || number < 0){
//            //get the last digit/ this is also the remainder
//            int lastDigit = number % 10;
//
//            //increasing the reverse by multiplying by 10 and adding to the last digit
//            reverse = (reverse * 10) + lastDigit;
//
//            //removing  the last digit
//            number = number / 10;
//
//        }
//
//        //comparing with the original number
//        if(originalNumber != reverse){
//            palindrome = false;
//        }
//        return palindrome;

//    public static boolean isPalindrome (int number) {
//        int saved = number;
//        int reverse = 0;
//        int lastDigit = 0;
//
//        while (saved != 0) {
//            lastDigit = saved % 10;
//            saved = saved / 10;
//
//            reverse = (reverse * 10) + lastDigit;
//        }
//
//        return (reverse == number);
//    }

}
