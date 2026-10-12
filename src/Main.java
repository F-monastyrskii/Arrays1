//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] inputArray1 = {15000, 23000, 18000, 32000, 27000};

        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];

        for (int payment : inputArray1){
            sum += payment;
            if (payment > max) {
                max=payment;
            }
            if (payment < min) {
                min=payment;
            }
        }

        float average = (float) sum / inputArray1.length;
        float[] outputArray1 = {sum, max, min , average };
        System.out.print("inputArray1: ");
        for (int i=0; i<inputArray1.length; i++) {;
            System.out.print(inputArray1[i]+ " ");
        }
        System.out.println();
        System.out.print("outputArray: ");

        for (int i=0; i < outputArray1.length; i++ ) {
            System.out.print(outputArray1[i] + " ");
        }



    }
}