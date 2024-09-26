import java.util.Scanner;
public class PemilihanHariDenganif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte angka;

        System.out.print("Masukan angka: ");
        angka = sc.nextByte();

        if (angka > 0 && angka <= 5) {
            System.out.println("weekday");
        } else if (angka >5 && angka <=7) {
            System.out.println("weekend");
        } else {
            System.out.println("Invalid Number");
        }

    }
}
