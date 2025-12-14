public class Pertunjukan {
    // Atribut
    String nama;
    String jadwal;
    String lokasi;

    // Constructor
    public Pertunjukan(String nama, String jadwal, String lokasi) {
        this.nama = nama;
        this.jadwal = jadwal;
        this.lokasi = lokasi;
    }

    // Method
    public void mulai() {
        System.out.println("Jam " + this.jadwal + " di Area " + this.lokasi + ": " + this.nama + " - Pertunjukan dimulai! Selamat menyaksikan.");
        }

    public void selesai() {
        System.out.println(this.nama + " telah selesai. Terima kasih sudah menonton.");
    }
}