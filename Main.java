public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];

        // Mengisi 20 objek kue
        daftarKue[0] = new KuePesanan("Kue Lapis", 30000, 0.5);
        daftarKue[1] = new KueJadi("Kue Nastar", 5000, 10);
        daftarKue[2] = new KuePesanan("Kue Bolu", 40000, 1.2);
        daftarKue[3] = new KueJadi("Kue Putri Salju", 6000, 8);
        daftarKue[4] = new KuePesanan("Kue Brownies", 45000, 0.8);
        daftarKue[5] = new KueJadi("Kue Donat", 4000, 12);
        daftarKue[6] = new KuePesanan("Kue Talam", 25000, 0.6);
        daftarKue[7] = new KueJadi("Kue Risoles", 3500, 15);
        daftarKue[8] = new KuePesanan("Kue Lumpur", 28000, 0.7);
        daftarKue[9] = new KueJadi("Kue Pastel", 4500, 11);
        daftarKue[10] = new KuePesanan("Kue Sus", 32000, 0.4);
        daftarKue[11] = new KueJadi("Kue Lemper", 3000, 13);
        daftarKue[12] = new KuePesanan("Kue Kering", 50000, 1.5);
        daftarKue[13] = new KueJadi("Kue Onde-Onde", 2500, 20);
        daftarKue[14] = new KuePesanan("Kue Pukis", 27000, 0.9);
        daftarKue[15] = new KueJadi("Kue Apem", 2000, 25);
        daftarKue[16] = new KuePesanan("Kue Dadar Gulung", 29000, 0.6);
        daftarKue[17] = new KueJadi("Kue Getuk", 2200, 18);
        daftarKue[18] = new KuePesanan("Kue Serabi", 26000, 1.1);
        daftarKue[19] = new KueJadi("Kue Bika Ambon", 7000, 7);

        // a. Tampilkan semua kue
        System.out.println("=== Daftar Semua Kue ===");
        for (Kue kue : daftarKue) {
            System.out.println(kue);
        }

        // b. Hitung total harga semua kue
        double totalHargaSemua = 0;
        for (Kue kue : daftarKue) {
            totalHargaSemua += kue.hitungHarga();
        }
        System.out.println("\nTotal Harga Semua Kue: " + totalHargaSemua);

        // c. Total harga dan berat dari KuePesanan
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("\nTotal Harga KuePesanan: " + totalHargaPesanan);
        System.out.println("Total Berat KuePesanan: " + totalBeratPesanan + " kg");

        // d. Total harga dan jumlah dari KueJadi
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("\nTotal Harga KueJadi: " + totalHargaJadi);
        System.out.println("Total Jumlah KueJadi: " + totalJumlahJadi + " buah");

        // e. Tampilkan informasi kue dengan harga (hitungHarga) terbesar
        Kue kueTermahal = daftarKue[0];
        for (Kue kue : daftarKue) {
            if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }
        System.out.println("\nKue dengan Harga Tertinggi:");
        System.out.println(kueTermahal);
    }
}
