//2112101067 Abulfaz İsmayilli

import java.util.Scanner;
public class bmi_tespit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz : ");
        double boy = scanner.nextDouble();


        System.out.println("Lütfen kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();


        double bmi = kilo/(boy * boy);
        System.out.println("BMI değeri: " + bmi );

        if (bmi < 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Durum: Normal");
        } else if (bmi >= 24.9 && bmi < 29.9) {
            System.out.println("Durum: Kilolu");
        } else if (bmi >= 29.9) {
            System.out.println("Durum: Obez");
        }
    }
}