//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Запрос от бухгалтерии");
        int[] inputArray1 = {15000, 23000, 18000, 32000, 27000};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int payment : inputArray1) {
            sum += payment;
            if (payment > max) {
                max = payment;
            }
            if (payment < min) {
                min = payment;
            }
        }
        float average = (float) sum / inputArray1.length;
        float[] outputArray1 = {sum, max, min, average};
        System.out.print("inputArray1: ");
        for (int i = 0; i < inputArray1.length; i++) {
            ;
            System.out.print(inputArray1[i] + " ");
        }
        System.out.println();
        System.out.print("outputArray1: ");
        for (int i = 0; i < outputArray1.length; i++) {
            System.out.print(outputArray1[i] + " ");
        }
        System.out.println();
        System.out.println("Запрос от налогового отдела");
        int[] inputArray2 = {10000, 20000, 30000, 40000, 50000};
        double factor = 0.87;
        double[] outputArray2 = new double[inputArray2.length];
        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * factor;
        }
        System.out.println("outputArray2: ");
        for (int i = 0; i < outputArray2.length; i++) {
            System.out.printf("%.2f", outputArray2[i]);
            if (i < outputArray2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Запрос от HR");

    }
}