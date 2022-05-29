public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99))
            return false;

        int firstDigit=num1%10;
        int secondDigit=num1/10;
        if(num2%10 == firstDigit || num2/10 == secondDigit)
            return true;
        else return num2 % 10 == secondDigit || num2 / 10 == firstDigit;
    }
}
