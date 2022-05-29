public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0)
            System.out.println("Invalid Value");
        int digitForPrint=0;
        int temp=reverse(number);
        for(int i=0;i<getDigitCount(number);i++){
            digitForPrint=temp%10;
            switch(digitForPrint){
                case 0:System.out.println("Zero");break;
                case 1:System.out.println("One");break;
                case 2:System.out.println("Two");break;
                case 3:System.out.println("Three");break;
                case 4:System.out.println("Four");break;
                case 5:System.out.println("Five");break;
                case 6:System.out.println("Six");break;
                case 7:System.out.println("Seven");break;
                case 8:System.out.println("Eight");break;
                case 9:System.out.println("Nine");break;
            }
            temp/=10;
        }

    }
    public static int reverse(int number){
        int revNum=0;
        int digit;
        while(number!=0){
            digit=number%10;
            revNum*=10;
            revNum+=digit;
            number/=10;
        }
        return revNum;
    }
    public static int getDigitCount(int number){
        if(number<0)
            return -1;
        int digitCount=0;
        do{
            number/=10;
            digitCount++;
        }while(number>0);
        return digitCount;
    }
}
