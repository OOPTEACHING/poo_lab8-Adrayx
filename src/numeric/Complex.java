package numeric;

public class Complex implements Numeric {
    private Pereche pereche;

    public Complex()
    {
        this(0, 0);
    }

    public Complex(int real, int imaginar)
    {
        pereche = new Pereche(real, imaginar);
    }

    @Override
    public Pereche getPair()
    {
        return pereche;
    }

    @Override
    public void setPair(Pereche x)
    {
        pereche = x;
    }

    @Override
    public int getX() {
        return pereche.getX();
    }

    @Override
    public void setX(int real) {
        pereche.setX(real);
    }

    @Override
    public int getY() {
        return pereche.getY();
    }

    @Override
    public void setY(int imaginar) {
        pereche.setY(imaginar);
    }

    @Override
    public Pereche inmultireScalar(int x)
    {
        int r, i;
        r = pereche.getX() * x;
        i = pereche.getY() * x;
        Pereche rez = new Pereche(r, i);
        return rez;
    }

    @Override
    public Pereche adunare(Pereche x) {
        int r, i;
        r = pereche.getX() + (x.getX());
        i = pereche.getY() + (x.getY());
        Pereche rez = new Pereche(r, i);
        return rez;
    }

    @Override
    public Pereche scadere(Pereche x) {
        int r, i;
        r = pereche.getX() - (x.getX());
        i = pereche.getY() - (x.getY());
        Pereche rez = new Pereche(r, i);
        return rez;
    }

    @Override
    public Pereche inmultire(Pereche x) {
        int r, i;
        r = pereche.getX() * (x.getX()) - pereche.getY() * (x.getY());
        i = pereche.getX() * (x.getY()) + pereche.getY() * (x.getX());
        Pereche rez = new Pereche(r, i);
        return rez;
    }
}
