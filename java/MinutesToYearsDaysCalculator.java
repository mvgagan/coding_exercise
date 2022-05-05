public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long toBeDays = hours / 24;
            long years = toBeDays / 365;
            long days = toBeDays % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
