package numeric;

public class Matrice {
    private int linii;
    private int coloane;
    private Numeric[][] matrice;

    public Matrice(int linii, int coloane)
    {
        this.linii = linii;
        this.coloane = coloane;
        matrice = new Numeric[linii][coloane];
    }

    public void setComplex(int i, int j, Pereche pereche)
    {
        matrice[i][j].setX(pereche.getX());
        matrice[i][j].setY(pereche.getY());
    }

    public void setFractie(int i, int j, Pereche pereche)
    {
        matrice[i][j].setX(pereche.getX());
        matrice[i][j].setY(pereche.getY());
    }

    public void adunare(Matrice matrice1, Matrice matrice2)
    {
        for(int i = 0; i < this.linii; i++)
            for(int j = 0; j < this.coloane; j++)
            {
                Pereche rez = matrice1.matrice[i][j].adunare(matrice2.matrice[i][j].getPair());
                this.matrice[i][j].setPair(rez);
            }
    }

    public void scadere(Matrice matrice1, Matrice matrice2)
    {
        for(int i = 0; i < this.linii; i++)
            for(int j = 0; j < this.coloane; j++)
            {
                Pereche rez = matrice1.matrice[i][j].scadere(matrice2.matrice[i][j].getPair());
                this.matrice[i][j].setPair(rez);
            }
    }

    public void inmultireScalar(Matrice matrice1, int scalar)
    {
        for(int i = 0; i < this.linii; i++)
            for(int j = 0; j < this.coloane; j++)
            {
                Pereche rez = matrice1.matrice[i][j].inmultireScalar(scalar);
                this.matrice[i][j].setPair(rez);
            }
    }

    public void inmultire(Matrice matrice1, Matrice matrice2)
    {
        for(int i = 0; i < this.linii; i++)
            for(int j = 0; j < this.coloane; j++)
            {
                for(int k = 0; k < this.coloane; j++)
                {
                    Pereche mul = matrice1.matrice[i][k].inmultire(matrice2.matrice[k][j].getPair());
                    this.matrice[i][j].setPair(this.matrice[i][j].adunare(mul));
                }
            }
    }
}
