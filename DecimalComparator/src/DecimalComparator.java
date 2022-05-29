public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double x1, double x2){
        x1*=1000;
        x2*=1000;
        if((int)x1 == (int)x2)
            return true;
        else return false;
    }
}
