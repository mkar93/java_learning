public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int savedNumber = number;
        int reverseNumber = 0;
        int lastDigit;
        int multiply = 10;
        while(true){
            lastDigit = number%10;
            reverseNumber*=multiply;
            reverseNumber+=lastDigit;
            number=number/10;
            if(number == 0)
                break;
        }
        return savedNumber == reverseNumber;
    }
}
