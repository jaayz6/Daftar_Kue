public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return harga * jumlah * 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah: " + jumlah + " buah, Total Harga: " + hitungHarga();
    }
}
