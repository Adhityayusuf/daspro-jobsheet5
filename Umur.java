import java.util.Scanner;
public class Umur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte umur;

        System.out.print("Masukkan Umur: ");
        umur = sc.nextByte();

        if (umur < 0 ) {
            System.out.println("Angka tidak valid");
        }
        if (umur >= 0 && umur <= 12) {
            System.out.println("Anak");
        }else if (umur >= 13 && umur <= 19) {
            System.out.println("Remaja");
        }else if (umur >= 20 && umur <= 64) {
            System.out.println("Dewasa");
        }else if(umur >= 65)
        {
            System.out.println("Lansia");
        }
    }
}
