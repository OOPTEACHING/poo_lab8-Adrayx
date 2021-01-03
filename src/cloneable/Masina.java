package cloneable;

public class Masina {
    public String marca;
    public String culoare;

    public Masina(String marca, String culoare) {
        this.culoare = culoare;
        this.marca = marca;
    }

    public void revopsire(String culoare)
    {
        this.culoare = culoare;
    }
}
