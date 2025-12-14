public class KendaraanSafari {
    // Atribut
    String nomor_kendaraan;
    int kapasitas;
    String sopir;

    // Constructor
    public KendaraanSafari(String nomor, int kap, String namaSopir) {
        this.nomor_kendaraan = nomor;
        this.kapasitas = kap;
        this.sopir = namaSopir;
    }

    // Method
    public void mulaiTur() {
        System.out.println("Mobil " + this.nomor_kendaraan + " (Sopir: " + this.sopir + ") mulai berjalan. Harap tetap di dalam kendaraan.");
    }

    public void berhenti() {
        System.out.println("Mobil " + this.nomor_kendaraan + " berhenti. Silakan mengamati hewan.");
    }
}