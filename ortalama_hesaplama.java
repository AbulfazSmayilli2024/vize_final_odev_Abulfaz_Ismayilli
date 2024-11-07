//2112101067 Abulfaz İsmayilli

import java.util.Scanner;

public class ortalama_hesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Matematik  notunuzu giriniz: ");
        double mat = scanner.nextDouble();

        System.out.println("WEB Programlama  notunuzu giriniz: ");
        double web = scanner.nextDouble();

        System.out.println("Algoritma Ve Programlamaya Giriş  notunuzu giriniz: ");
        double algoritma = scanner.nextInt();

        double ortalama = mat + web + algoritma ;
        System.out.println("Ortalama: " + ortalama / 3);

        if (ortalama >= 50) {
            System.out.println("Başarılı .");
        } else  {
            System.out.println("Başarısız. ");
        }
    }
}