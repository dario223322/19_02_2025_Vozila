public abstract class GeometrijskiLik {
    private String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public abstract double povrsina();

    public abstract double opseg();

    @Override
    public String toString() {
        return "Naziv: " + naziv + "\nPovršina: " + povrsina() + "\nOpseg: " + opseg();
    }
}
