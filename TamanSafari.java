import java.util.Scanner;

public class TamanSafari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang = "ya"; // Variabel kontrol loop

        do {
            System.out.println("\n=== SISTEM INPUT TAMAN SAFARI ===");

            // DATA HEWAN
            System.out.println("\n--- Input Data Hewan (Singa) ---");
            System.out.print("Masukkan Nama Singa: ");
            String namaSinga = scanner.nextLine();

            System.out.print("Masukkan Umur Singa: ");
            int umurSinga = scanner.nextInt();
            scanner.nextLine();

            Singa s1 = new Singa(namaSinga, umurSinga);
            

            // DATA TIKET
            System.out.println("\n--- Input Data Tiket ---");
            System.out.print("Masukkan Tipe Tiket (Dewasa/Anak): ");
            String tipeTiket = scanner.nextLine();

            System.out.print("Masukkan Harga Tiket: ");
            int hargaTiket = scanner.nextInt();
            scanner.nextLine();

            Tiket t1 = new Tiket(101, tipeTiket, hargaTiket);


            // DATA PENGUNJUNG
            System.out.println("\n--- Input Data Pengunjung ---");
            System.out.print("Masukkan Nama Pengunjung: ");
            String namaPengunjung = scanner.nextLine();

            System.out.print("Masukkan Umur Pengunjung: ");
            int umurPengunjung = scanner.nextInt();
            scanner.nextLine();

            Pengunjung p1 = new Pengunjung(namaPengunjung, umurPengunjung);
            p1.beliTiket(t1);
            p1.masukArea();


            // KENDARAAN
            System.out.println("\n--- Input Kendaraan Safari ---");
            System.out.print("Masukkan Nama Mobil: ");
            String namaMobil = scanner.nextLine();

            System.out.print("Masukkan Plat Nomor: ");
            String platNomor = scanner.nextLine();

            System.out.print("Masukkan Kapasitas Penumpang: ");
            int kapasitas = scanner.nextInt();
            scanner.nextLine();

            KendaraanSafari mobil = new KendaraanSafari(namaMobil, platNomor, kapasitas);
            
            System.out.println("\n--- MEMULAI TUR ---");
            mobil.mulaiTur();


            // INTERAKSI
            System.out.println("\n--- INTERAKSI ---");
            s1.suara(); 
            s1.makan();
            mobil.berhenti();

            // PERTUNJUKAN
            Pertunjukan show = new Pertunjukan("Lumba-lumba Show", "10:00 WIB", "Kolam A");
            show.mulai();
            show.selesai();

            // --- KONFIRMASI LOOP ---
            System.out.print("\nApakah ingin input data lagi? (ya/tidak): ");
            ulang = scanner.next();
            scanner.nextLine();

        } while (ulang.equalsIgnoreCase("ya"));

        System.out.println("\n=== PROGRAM SELESAI ===");
        scanner.close();
    }
}