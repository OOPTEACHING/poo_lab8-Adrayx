package numeric;

public class Fractie implements Numeric {
    private Pereche pereche;

    public Fractie()
    {
        this(0, 1);
    }

    public Fractie(int numarator, int numitor)
    {
        this.pereche.setX(numarator);
        this.pereche.setY(numitor);
    }

    public Pereche getPair() {
        return pereche;
    }

    public void setPair(Pereche pereche) {
        this.pereche = pereche;
    }

    public int getNumarator() {
        return this.pereche.getX();
    }

    public void setNumarator(int numarator) {
        this.pereche.setX(numarator);
    }

    public int getNumitor() {
        return this.pereche.getY();
    }

    public void setNumitor(int numitor) {
        this.pereche.setY(numitor);
    }

    public int cmmdc(int x, int y)
    {
        if(x == 0 && y == 0)
            return -1;
        else if(x == 0)
            return y;
        else if(y == 0)
            return x;
        return cmmdc(y, x%y);

    }

    public Pereche simplificare(int numarator, int numitor)
    {
        int gcd = cmmdc(numarator, numitor);
        while(gcd != 1) {
            numitor /= gcd;
            numarator /= gcd;
            gcd = cmmdc(numitor, numarator);
        }
        Pereche rez = new Pereche(numarator, numitor);
        return rez;
    }

    @Override
    public Pereche inmultireScalar(int x){
        int numarator, numitor;
        numarator = pereche.getX() * x;
        numitor = pereche.getY();
        Pereche rez = simplificare(numarator, numitor);
        return rez;
    }

    @Override
    public Pereche adunare(Pereche x) {
        int noulNumitor, noulNumarator;
        noulNumitor = this.pereche.getX() * (x.getX());
        noulNumarator = this.pereche.getY() * (x.getY()) + (x.getX()) * this.pereche.getY();
        Pereche rez = simplificare(noulNumarator, noulNumitor);
        return rez;
    }

    @Override
    public Pereche scadere(Pereche x) {
        int noulNumitor, noulNumarator;
        noulNumitor = this.pereche.getY() * (x.getY());
        noulNumarator = this.pereche.getX() * (x.getY()) - (x.getX()) * this.pereche.getY();
        Pereche rez = simplificare(noulNumarator, noulNumitor);
        return rez;
    }

    @Override
    public Pereche inmultire(Pereche x) {
        int noulNumitor, noulNumarator;
        noulNumitor = this.pereche.getY() * (x.getY());
        noulNumarator = this.pereche.getX() * (x.getX());
        Pereche rez = simplificare(noulNumarator, noulNumitor);
        return rez;
    }
}
