public class TamanSafari {
    public static void main(String[] args) {
        System.out.println("=== TAMAN SAFARI ===");
        // Hewan
        Singa s1 = new Singa("Simba", 5);
        
        s1.setNama("King Simba");
        System.out.println("Nama Hewan: " + s1.getNama());
        
        // Buat Tiket & Pengunjung
        Tiket t1 = new Tiket(0555, "Dewasa", 150000);
        Pengunjung p1 = new Pengunjung("Andi", 20);
        
        t1.info();
        p1.beliTiket(t1);
        p1.masukArea();

        System.out.println("\n--- MULAI TUR ---");
        
        // Kendaraan Safari
        KendaraanSafari mobil = new KendaraanSafari("Ferrari", "B-1234-SAF", 6 );
        mobil.mulaiTur();
        
        // Interaksi Hewan
        s1.suara();
        s1.makan();
        
        mobil.berhenti();

        System.out.println("\n--- PERTUNJUKAN ---");

        // 4. Pertunjukan
        Pertunjukan show = new Pertunjukan("Lumba-lumba Show", "10:00 WIB", "Kolam A");
        show.mulai();
        show.selesai();
    }
}