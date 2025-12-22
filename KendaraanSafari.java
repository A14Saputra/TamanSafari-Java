public class KendaraanSafari {
    // Atribut
    String nama_kendaraan;
    String nomor_kendaraan;
    int kapasitas;

    // Constructor
    public KendaraanSafari(String kendaraan, String nomor, int kap) {
        this.nama_kendaraan = kendaraan;
        this.nomor_kendaraan = nomor;
        this.kapasitas = kap;
    }

    // Method
    public void mulaiTur() {
        System.out.println("Mobil " + this.nama_kendaraan + " " + this.nomor_kendaraan + " mulai berjalan. Harap tetap di dalam kendaraan.");
    }

    public void berhenti() {
        System.out.println("Mobil " + this.nama_kendaraan + " " + this.nomor_kendaraan + " berhenti. Silakan mengamati hewan.");
    }
}