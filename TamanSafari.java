public class TamanSafari {
    public static void main(String[] args) {
        System.out.println("=== TAMAN SAFARI BARU ===");

        // 1. Buat Hewan & Tiket
        Hewan h1 = new Hewan("Simba", "Singa", 5, "Daging");
        Tiket t1 = new Tiket("Terusan", 150000);

        // 2. Buat Pengunjung
        Pengunjung p1 = new Pengunjung("Andi", 20);
        
        // 3. Proses Beli Tiket & Masuk
        t1.info();
        p1.beliTiket(t1);
        p1.masukArea();

        System.out.println("\n--- MULAI TUR ---");
        
        // 4. Kendaraan Safari
        KendaraanSafari mobil = new KendaraanSafari("B-1234-SAF", 6, "Pak Budi");
        mobil.mulaiTur();
        
        // Interaksi Hewan di jalan
        h1.suara();
        h1.makan();
        
        mobil.berhenti();

        System.out.println("\n--- PERTUNJUKAN ---");

        // 5. Pertunjukan
        Pertunjukan show = new Pertunjukan("Lumba-lumba Show", "10:00 WIB", "Kolam A");
        show.mulai();
        show.selesai();
    }
}