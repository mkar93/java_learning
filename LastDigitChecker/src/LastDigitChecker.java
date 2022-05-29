public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000))
            return false;

        int firstLastDigit = num1%10;
        int secondLastDigit = num2%10;
        int thirdLastDigit = num3%10;

        if(firstLastDigit == secondLastDigit)
            return true;
        else if (firstLastDigit == thirdLastDigit)
            return true;
        else return secondLastDigit == thirdLastDigit;
    }
    public static boolean isValid(int num){
        return num >= 10 && num <= 1000;
    }

}
