
import java.util.Scanner;

public class kalınincese {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Klavyeden harf alınız:");
        char harf = scanner.next().charAt(0);

        switch (harf) {
            case 'A':
            case 'O':
            case 'I':
            case 'U':
            case 'a':
            case 'o':
            case 'ı':
            case 'u':

                System.out.println("kalın harf.");
                break;
            default:
                System.out.println("İnce harf.");

        }
    }
}
