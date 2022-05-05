public class TeenNumberChecker {

    public static boolean hasTeen (int num1, int num2, int num3)  {

        boolean teen = false;
        if (num1 >= 13 && num1 <= 19){
            teen = true;
        } else if (num2 >= 13 && num2 <= 19) {
            teen = true;
        } else if (num3 >= 13 && num3 <= 19) {
            teen = true;
        }

        return teen;
    }

    public static boolean isTeen (int num) {

        boolean teen1 = false;
        if (num >=13 && num <= 19) {
            teen1 = true;
        }

        return teen1;
    }

    public static void main(String[] args) {

        boolean teen = hasTeen(9,99,19);
        System.out.println(teen);
        boolean teen1 = isTeen(13);
        System.out.println(teen1);
    }
}
