package numeric;

public interface Numeric {
    public Pereche getPair();
    public void setPair(Pereche pereche);
    public int getX();
    public void setX(int x);
    public int getY();
    public void setY(int y);
    public Pereche inmultireScalar(int x);
    public Pereche adunare(Pereche x);
    public Pereche scadere(Pereche x);
    public Pereche inmultire(Pereche x);
}
