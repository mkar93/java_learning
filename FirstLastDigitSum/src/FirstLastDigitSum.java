public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0)
            return -1;
        int lastDigit=number%10;
        int firstDigit;
        int sumOfDigits=0;
        while(number != 0){
            firstDigit=number/10;
            if(firstDigit == 0){
                firstDigit=lastDigit;
            }
            if(firstDigit < 10) {
                sumOfDigits = firstDigit + lastDigit;
                break;
            }
            number/=10;
        } return sumOfDigits;
    }
}
