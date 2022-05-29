public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0)
            return -1;
        int sum=0;
        int evenDigit;
        while(number > 0){
            if((number%10)%2 == 0){
                evenDigit=number%10;
                sum+=evenDigit;
            }
            number/=10;
        }
        return sum;
    }
}
