public class Tiket {
    // Encapsulation
    private String tipe;
    private int harga;

    public Tiket(String tipe, int harga) {
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getTipe() {
        return this.tipe;
    }

    public int getHarga() {
        return this.harga;
    }

    public void info() {
        System.out.println("--- INFO TIKET ---");
        System.out.println("Tipe : " + this.tipe);
        System.out.println("Harga: Rp" + this.harga);
    }
}