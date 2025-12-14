import java.util.ArrayList;

public class Kandang {
    // 1. ATRIBUT
    String kodeKandang;
    String jenisSpesies;
    int kapasitasMaks;
    ArrayList<Hewan> daftarHewan;

    // 2. CONSTRUCTOR
    public Kandang(String kode, String spesies, int kapasitas) {
        this.kodeKandang = kode;
        this.jenisSpesies = spesies;
        this.kapasitasMaks = kapasitas;
        this.daftarHewan = new ArrayList<>();
    }

    // 3. METHOD
    public void tambahHewan(Hewan h) {
        if (this.daftarHewan.size() < this.kapasitasMaks) {
            this.daftarHewan.add(h);
            System.out.println(h.nama + " masuk ke kandang " + this.jenisSpesies);
        } else {
            System.out.println("Gagal! Kandang " + this.kodeKandang + " penuh.");
        }
    }

    public void cekIsiKandang() {
        System.out.println("\n--- Penghuni Kandang " + this.kodeKandang + " (" + this.jenisSpesies + ") ---");
        System.out.println("Jumlah: " + this.daftarHewan.size() + "/" + this.kapasitasMaks);
        
        // Looping untuk menampilkan setiap hewan
        for (Hewan h : daftarHewan) {
            System.out.println("- " + h.nama + " (Umur: " + h.umur + ")");
        }
    }
}