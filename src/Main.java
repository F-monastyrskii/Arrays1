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
        System.out.print("inputArray1: [");
        for (int i = 0; i < inputArray1.length; i++) {
            ;
            System.out.print(inputArray1[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.print("outputArray1: [");
        for (int i = 0; i < outputArray1.length; i++) {
            System.out.print(outputArray1[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println();
        System.out.println("Запрос от налогового отдела");
        int[] inputArray2 = {10000, 20000, 30000, 40000, 50000};
        double factor = 0.13;//определяю 13 процентов
        int index = 0;
        double[] outputArray2 = new double[inputArray2.length];
        for (int payment2 : inputArray2){//вычисляю через for each
            outputArray2[index] = (payment2 * factor);
            index++;
        }
        System.out.print("outputArray2: [");
        for (int i = 0; i < outputArray2.length; i++) {
            System.out.printf("%.2f", outputArray2[i]);
            if (i < outputArray2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        System.out.println();
        System.out.println();
        System.out.println("Запрос от HR");
        int[] inputArray3 = {4500, 3345, 1234, 6789, 4567};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        index=0;
        for (int value : inputArray3){
            outputArray3[index]=value>5000;
            index++;
        }
        System.out.print("inputArray3:[");
        for (int i = 0; i<outputArray3.length; i++){
            System.out.print(inputArray3[i]);
            if (i<outputArray3.length-1) System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
        System.out.print("outputArray3:[");
        boolean first = true;
        for (boolean val : outputArray3 ){
            if (!first){
                System.out.print(", ");
            }
            System.out.print(val);
            first = false;
        }
        System.out.println("]");

        System.out.println();
        System.out.println("Запрос от кредитного отдела");
        int[] inputArray4 = {3456, -1234, 3456, 34, 2345};
        boolean[] outputArray4 = new boolean[1];
        outputArray4[0]=true;
        for (int balance : inputArray4){
            if (balance<0){
                outputArray4[0]=false;
                break;
            }
        }

        System.out.print("inputArray4:[");
        for (int i =0; i<inputArray4.length; i++){
            System.out.print(inputArray4[i]);
            if (i < inputArray4.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("] ");
        System.out.println("outputArray4: [" + outputArray4[0] + "]");

        System.out.println();
        System.out.println("Запрос от CEO");
        int[] inputArray5={2345, -4567, -5678, 2345, 678};
        int profitableMonthsCount = 0;
        for (int profit : inputArray5){
            if (profit>0){
            profitableMonthsCount++;
            }
        }
        int[] outputArray5 = new int[1];
        outputArray5[0]=profitableMonthsCount;

        System.out.print("inputArray5:[");
        for (int i = 0; i < inputArray5.length; i++) {
            System.out.print(inputArray5[i]);
            if (i< inputArray5.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("] ");

        System.out.print("outputArray5: [" + outputArray5[0] + "]");
    }
}