
import java.util.Scanner;

public class büyükküçük {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz");
        int x = input.nextInt();
        System.out.print("İkinci sayıyı giriniz");
        int y = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz");
        int z = input.nextInt();

        System.out.println("Üç sayıdan en küçük sayı:" + Math.min(Math.min(x, y), Math.min(y, z)));
        System.out.println("Üç sayıdan en büyük sayı:" + Math.max(Math.max(x, y), Math.max(y, z)));

    }

}
