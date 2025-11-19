import java.util.Scanner;

public class modifikasipercobaan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        int menu;
        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch(menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    int kolom = sc.nextInt();
                    sc.nextLine();
                    
                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                     System.out.println("Kursi tidak tersedia!");
                     System.out.println("Silakan masukkan baris 1–4 dan kolom 1–2.");
                } 
                else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil disimpan!");
}
                case 2:
                    System.out.println("\n=== DAFTAR PENONTON ===");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print(penonton[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while(menu != 3);
    }
}
    