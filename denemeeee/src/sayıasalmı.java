
import java.util.Scanner;

public class sayıasalmı {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //kullanıcıdan sayı alınız.
        System.out.println("Sayı giriniz:");
        int sayı = scanner.nextInt();
        //sayıyı boolean ile asal mı asal değil mi diye tanımla
        boolean asalmı = true;
        // sayı değerini 1 girdiğin zaman oluşacak fonksiyonu yazdır.
        if (sayı < 2) {
            System.out.println("Yanlış bir değer girdiniz.");
            return;

        }
        //for döngüsü ile bölüneni tanımla
        for (int i = 2; i < sayı; i++) {
            if (sayı % i == 0) {
                asalmı = false;
                break;
            }
        }
        if (asalmı) {
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }

    }

}
