public class Hewan {
    String nama;
    String spesies;
    int umur;
    String makanan;

    // Constructor
    public Hewan(String nama, String spesies, int umur, String makanan) {
        this.nama = nama;
        this.spesies = spesies;
        this.umur = umur;
        this.makanan = makanan;
    }

    // Method
    public void makan() {
        System.out.println(this.nama + " si " + this.spesies + " sedang memakan " + this.makanan);
    }

    public void suara() {
        System.out.println(this.nama + " mengeluarkan suara khasnya!");
    }
}
