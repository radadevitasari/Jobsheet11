import java.util.Scanner;

public class PertanyaanPercobaan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa   : ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah matkul  : ");
        int jumlahMatkul = sc.nextInt();
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        System.out.println("\n=== Input Nilai ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1));
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai Matkul ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n=== Daftar Nilai Siswa ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Siswa " + (i + 1) + ": ");
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }
}

