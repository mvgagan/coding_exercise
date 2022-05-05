public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean returnVariable = false;
        if (barking) {
            if (hourOfDay < 8 && hourOfDay >= 0) {
                returnVariable = true;
            } else if (hourOfDay > 22 && hourOfDay <= 23) {
                returnVariable = true;
            } else if (hourOfDay < 0 || hourOfDay > 23 ) {
                returnVariable = false;
            }
        } else {
            returnVariable = false;
        }

        return returnVariable;
    }

    public static void main(String[] args) {

        boolean name = shouldWakeUp(true, 0);
        System.out.println(name);
    }
}
