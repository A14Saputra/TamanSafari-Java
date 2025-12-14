public class Tiket {
    String tipe;
    int harga;

    public Tiket(String tipe, int harga) {
        this.tipe = tipe;
        this.harga = harga;
    }

    public void info() {
        System.out.println("--- INFO TIKET ---");
        System.out.println("Tipe : " + this.tipe);
        System.out.println("Harga: Rp" + this.harga);
    }
}