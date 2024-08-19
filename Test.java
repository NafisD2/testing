

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double bb, tb, bmi;
        Scanner input = new Scanner(System.in);

        System.out.println("Berat Badan (kg) = ");
        bb = input.nextDouble();
        System.out.println("Tinggi Badan (cm) = ");
        tb = input.nextDouble();

        bmi = bb / (tb/100 * tb/100);
        System.out.println("BMI = " +bmi);
    }

}
