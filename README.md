Pertanyaan percobaan 1

1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
   Jawab=Tidak harus.Pada array 2 dimensi, boleh mengisi elemen mana pun terlebih dahulu, misalnya langsung mengisi penonton[3][1] tanpa mengisi baris sebelumnya.Namun, kalau ada elemen yang tidak diisi, maka Java otomatis memberikan nilai default, yaitu null (karena tipe datanya String). 

2. Mengapa terdapat null pada daftar nama penonton?
   Jawab= Karena elemen penonton[3][1] belum diberi nilai.

3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut
penonton [0][0] = "Amin";
penonton [0] [1] "Bena";
penonton [1][0] "Candra";
penonton [1] [1] "Dela";
penonton [2][0] = "Eka";
penonton [2] [1] ="Farhan";
penonton [3][0] = "Gisel";
penonton [3][1] = "Hana";


4. Tambahkan kode program sebagai berikut:
System.out.println(penonton.length);
System.out.println(penonton [0].length);
System.out.println(penonton [1].length);
System.out.println(penonton [2].length);
System.out.println(penonton [3].length);
Jelaskan fungsi dari penonton. length dan penonton [0].length!
Apakah penonton [0].length, penonton [1].length, penonton [2].length, dan penonton [3].length memiliki nilai yang sama? Mengapa?
Jawab= -penonton.length berfungsi untuk mengetahui jumlah baris pada array 2 dimensi. Karena array dibuat dengan ukuran new String[4][2], maka jumlah barisnya adalah 4.
-penonton[0].length berfungsi untuk mengetahui jumlah kolom pada baris pertama (indeks 0). Nilainya 2, karena setiap baris memiliki dua kolom.
-Apakah semua baris memiliki nilai length yang sama?
Ya, penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length semuanya bernilai 2, karena array 2 dimensi tersebut dibuat dengan jumlah kolom yang sama untuk setiap baris, yaitu 2 kolom.
-Karena saat array dibuat dengan:new String[4][2] artinya setiap baris otomatis memiliki 2 kolom.
Dalam array 2 dimensi Java, ukuran baris dan kolom sudah ditentukan di awal. Jadi, semua baris akan mempunyai jumlah kolom yang sama.

5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array menggunakan for loop. Compile, run, lalu amati hasilnya.
System.out.println(penonton.length);
for (int i=0; i < penonton.length; i++) {
}
System.out.println("Panjang baris ke-" + (i+1) + ": + penonton [i].length);
Jawab= mencetak jumlah baris pada array, yaitu 4, karena array penonton memang memiliki 4 baris.Setelah itu, perulangan for berjalan dari baris pertama sampai baris terakhir menggunakan indeks i.Pada setiap putaran, program menampilkan panjang baris ke-(i+1) menggunakan penonton[i].length.Karena setiap baris memiliki 2 kolom, maka setiap baris selalu menghasilkan nilai 2.

 
6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.
System.out.println(penonton.length);
for (String[] barisPenonton penonton) {
}
System.out.println("Panjang baris: barisPenonton.length);
Jawab= program kembali menampilkan jumlah baris array, yaitu 4.Perbedaannya adalah foreach tidak memakai indeks; ia langsung mengambil setiap baris dalam variabel barisPenonton.Setiap kali foreach berjalan, program menampilkan panjang baris tersebut.Karena semua baris memiliki jumlah kolom yang sama, yaitu 2, maka hasilnya juga selalu 2 untuk tiap baris.


7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop. Compile, run, lalu amati hasilnya.
System.out.println("Penonton pada baris ke-3: ");
for (int i = 0; i < penonton [2].length; i++) {
System.out.println(penonton[2][i]);
}
Jawab= Program menampilkan tulisan "Penonton pada baris ke-3:" sebagai judul.
Karena baris ke-3 ada pada indeks 2, maka program mengambil data dari penonton[2].Loop for berjalan sebanyak jumlah kolom di baris tersebut (yaitu 2 kali).Setiap putaran, program mencetak nama penonton yang ada di baris ke-3, yaitu isi dari:
penonton[2][0]
penonton[2][1]
Hasilnya kedua nama pada baris ke-3 tampil satu per satu.


8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop. Compile, run, lalu lakukan amati hasilnya.
System.out.println("Penonton pada baris ke-3: ");
for (String i penonton [2]) {
System.out.println(i);
}

9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.
for (int i=0; i < penonton.length; i++) {
} System.out.println("Penonton pada baris ke-" + (i+1)+":"+ String.join(", ", penonton [i]));
Jawab= 

10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
    Jawab= Kelebihan foreach:
Lebih sederhana dan mudah dibaca.
Mengurangi risiko error index (ArrayIndexOutOfBounds).
Tidak perlu menulis i++ atau batas loop.
Kekurangan foreach:
Tidak bisa mengakses indeks secara langsung.
Tidak bisa mengubah elemen array posisi tertentu dengan mudah.
Tidak bisa melakukan looping mundur.
Tidak cocok jika butuh kontrol penuh terhadap indeks.

11. Berapa indeks baris maksimal untuk array penonton?
    Jawab= Array penonton memiliki 4 baris.
Dalam array, penomoran indeks selalu dimulai dari 0, bukan 1.
Jadi baris ke-1 ada di indeks 0, baris ke-2 di indeks 1, baris ke-3 di indeks 2, dan baris ke-4 di indeks 3.
Karena baris terakhir berada pada indeks 3, maka: Indeks baris maksimal = 3

12. Berapa indeks kolom maksimal untuk array penonton?
    Jawab= Setiap baris dalam array memiliki 2 kolom.
Seperti baris, kolom juga dimulai dari indeks 0.
Kolom pertama berada pada indeks 0 dan kolom kedua berada pada indeks 1.
Karena kolom terakhir ada di indeks 1, maka:
 Indeks kolom maksimal = 1

13. Apa fungsi dari String.join()?
    Jawab= String.join() digunakan untuk menggabungkan beberapa string menjadi satu kalimat, dengan pemisah tertentu.

pertanyaan percobaan 2 
1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
   Jawab= Tidak harus.Saat menggunakan Scanner, pengguna bebas memilih ingin mengisi baris dan kolom mana dulu. Java juga tidak mewajibkan pengisian harus mulai dari indeks 0.Yang penting, posisi baris dan kolom yang dimasukkan ada dalam ukuran array.Jika tidak diisi, elemen tersebut akan tetap bernilai null. 

2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut:
Menu 1: Input data penonton
Menu 2: Tampilkan daftar penonton
Menu 3: Exit
  Jawab= commit modifikasi no 2

3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang tidak tersedia
 Jawab= commit modifikasi no 3

4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan baris dan kolom Kembali
 Jawab= commit modifikasi no 4

5. Pada menu 2, jika kursi kosong, ganti null dengan ***
Jawab= commit modifikasi no 5

pertanyaan percobaan 3

1. Tambahkan kode program sebagai berikut
for (int i=0; i < myNumbers.length; i++) {
}
System.out.println(Arrays.toString(myNumbers[i]));
 Jawab= commit tambahan kode no 1

2. Apa fungsi dari Arrays.toString()?
 Jawab=Fungsi Arrays.toString() adalah mengubah isi array menjadi teks (string) yang rapi dan mudah dibaca.
Tanpa Arrays.toString(), Java hanya menampilkan alamat memori, bukan isi array. 

3. Apa nilai default untuk elemen pada array dengan tipe data int?
 Jawab=Nilai default untuk elemen array bertipe int adalah 0.
Jadi kalau kamu membuat array int tetapi belum mengisinya, semua elemennya otomatis bernilai 0.

4. Tambahkan kode program berikut
for (int i=0; i < myNumbers.length; i++) {
}
System.out.println("Panjang baris ke-" (1+1) + ": + myNumbers[i].length);
 Jawab= commit tambahan kode 4

5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi?
 Jawab= Panjang array tidak bisa diubah setelah array tersebut dibuat (fixed size).
Kalau ingin ukuran berbeda, solusinya adalah membuat array baru dengan panjang yang diinginkan.

pertanyaan percobaan 4
 1. Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? Modifikasi kode program SIAKAD untuk mengakomodasi jumlah siswa dan jumlah mata kuliah yang dinamis.
Jawab= Jika jumlah siswa dan jumlah mata kuliah dapat berubah-ubah, maka kode SIAKAD harus dibuat dinamis, yaitu jumlah baris dan kolom array tidak ditentukan secara tetap (hardcode), tetapi ditentukan melalui input dari pengguna.Karena panjang array tidak bisa diubah setelah dibuat, maka solusinya adalah membuat array baru berdasarkan jumlah siswa dan jumlah mata kuliah yang diinput.