import java.util.Scanner;
public class PemilihanBilangan13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Sebuah angka: ");
        int angka = sc.nextInt();

        String jenisBilangan = (angka % 2 == 0) ? " genap " : " ganjil ";
        System.out.println("Angka " + angka + " termasuk bilangan " + jenisBilangan);
        
    }
}