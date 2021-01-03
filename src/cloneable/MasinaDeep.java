package cloneable;

public class MasinaDeep implements Cloneable {
    public String marca;
    public String culoare;

    public MasinaDeep(String marca, String culoare) {
        this.culoare = culoare;
        this.marca = marca;
    }

    public void revopsire(String culoare)
    {
        this.culoare = culoare;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
