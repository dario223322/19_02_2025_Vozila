public class Pravokutnik extends GeometrijskiLik {
    //private String naziv;
    private int a;
    private int b;

    public Pravokutnik(String naziv, int a, int b) {
        super(naziv);
        this.a = a;
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a * b;
    }

    @Override
    public double opseg() {
        return 2 * (a + b);
    }
}
