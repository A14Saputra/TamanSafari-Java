public class Singa extends Hewan {
    
    public Singa(String nama, int umur) {
        super(nama, "Singa", umur, "Daging");
    }

    // Polymorpism
    @Override
    public void suara() {
        System.out.println("Roaaarrr!! " + this.getNama() + " mengaum dengan sangat keras!");
    }
}