public class Pengunjung {
    // Atribut
    String nama;
    int usia;
    String jenis_tiket; // Menyimpan info tiket yang dibeli

    // Constructor
    public Pengunjung(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
        this.jenis_tiket = "Belum Beli"; // Default awal
    }

    // Method
    public void beliTiket(Tiket t) {
        this.jenis_tiket = t.tipe;
        System.out.println(this.nama + " berhasil membeli tiket " + t.tipe + " seharga Rp" + t.harga);
    }

    public void masukArea() {
        if (!this.jenis_tiket.equals("Belum Beli")) {
            System.out.println(this.nama + " masuk ke area safari dengan tiket " + this.jenis_tiket + ".");
        } else {
            System.out.println(this.nama + " dilarang masuk! Silakan beli tiket dulu.");
        }
    }
}