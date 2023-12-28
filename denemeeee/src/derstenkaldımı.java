
import java.util.Scanner;

public class derstenkaldımı {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize notunu giriniz: ");
        int vize1 = scanner.nextInt();
        System.out.print("Final notunu giriniz: ");
        int final1 = scanner.nextInt();//final1 diye girmemizin sebebi; final anahtar olabilir.
        double ortalama = vize1 * 0.4 + final1 * 0.6;
        System.out.println("Otalamanız: " + ortalama);
        if (ortalama < 50) {
            System.out.println("Dersten kaldınız,geçmiş olsun.");
        } else {
            System.out.println("Dersten geçtiniz, hayırlı olsun.");
        }

    }

}
