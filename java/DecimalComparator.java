public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {

        boolean same = true;
        int intNum1 = (int) (num1 * 1000);
        int intNum2 = (int) (num2 * 1000);
        if (intNum1 == intNum2) {
            same = true;
        } else {
            same = false;
        }

        return same;
    }

    public static void main(String[] args) {

        boolean same = areEqualByThreeDecimalPlaces(3.176,3.175);
        System.out.println(same);
    }
}
