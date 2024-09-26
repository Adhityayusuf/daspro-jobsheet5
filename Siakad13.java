import java.util.Scanner;

public class Siakad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaikuis, nilaitugas, nilaiujian, nilaiAkhir;

        System.out.print("Masukan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan Nim: ");
        nim = sc.nextLine();
        System.out.print("Masukan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukan nilai kuis: ");
        nilaikuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas: ");
        nilaitugas = sc.nextDouble();
        System.out.print("Masukan nilai ujian: ");
        nilaiujian = sc.nextDouble();
        System.out.println("Mahasiswa dengan nama " + nama + " Nim " + nim + " Kelas " + kelas + " Nomor absen " + absen);
        nilaiAkhir = (nilaikuis * 20/100) + (nilaitugas * 15/100) + (nilaiujian * 30/100) + (nilaiujian * 35/100);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        String nilaiHuruf,kualifikasi;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100 ) {
            kualifikasi = "Sangat baik";
            nilaiHuruf = "A";
        }else if (nilaiAkhir > 73 && nilaiAkhir <= 80 ) {
            kualifikasi = "Lebih dari Baik";
            nilaiHuruf = "B+";
        }else if (nilaiAkhir > 65 && nilaiAkhir <= 73 ) {
            kualifikasi = "Baik";
            nilaiHuruf = "B";
        }else if (nilaiAkhir > 60 && nilaiAkhir <= 65 ) {
            kualifikasi = "Lebih dari Cukup";
            nilaiHuruf = "C+";
        }else if (nilaiAkhir > 50 && nilaiAkhir <= 60 ) {
            kualifikasi = "Cukup";
            nilaiHuruf = "C";
        }else if (nilaiAkhir > 39 && nilaiAkhir <= 50 ) {
            kualifikasi = "Kurang";
            nilaiHuruf = "D";
        }else {
            kualifikasi = "Gagal";
            nilaiHuruf = "E";
        }

        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}
