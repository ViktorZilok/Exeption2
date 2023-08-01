
// Если необходимо, исправьте данный код

public class Task2 {

    public static void main(String[] args) {

        try {
            int d = 0;
            int[] intArray = new int[]{3, 232, 76, 7, 0, 43, 7, 89, 65, 7474, 36, 9};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }


}
