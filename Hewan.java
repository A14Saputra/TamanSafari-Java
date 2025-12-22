public abstract class Hewan {
    // Atribut sesuai diagram
    private String nama;
    private String spesies;
    private int umur;
    private String makanan;

    public Hewan(String nama, String spesies, int umur, String makanan) {
        this.nama = nama;
        this.spesies = spesies;
        this.umur = umur;
        this.makanan = makanan;
    }

    public void makan() {
        System.out.println(this.nama + " si " + this.spesies + " sedang memakan " + this.makanan);
    }

    // Method Abstract
    public abstract void suara();

    // GETTER & SETTER
    
    public String getNama() {
        return this.nama;
    }

    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }

    public void setUmur(int umurBaru) {
        if (umurBaru > 0) {
            this.umur = umurBaru;
        } else {
            System.out.println("Error: Umur tidak boleh negatif!");
        }
    }
}