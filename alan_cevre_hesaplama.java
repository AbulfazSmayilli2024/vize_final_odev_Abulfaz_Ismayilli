//2112101067 Abulfaz İsmayilli

import java.util.Scanner;

public class alan_cevre_hesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kısa kenarı giriniz: ");
        double kısa = scanner.nextDouble();

        System.out.println("Uzun kenarı giriniz: ");
        double uzun = scanner.nextDouble();

        double cevre = 2 * (kısa + uzun);
        System.out.println("Dikdörtken Çevresi=" + cevre);

        double alan = uzun * kısa;
        System.out.println("Dikdörtken Alanı=" + alan);


    }
}