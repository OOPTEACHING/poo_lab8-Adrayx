//package numeric;
//
//public class MatriceFractie {
//    private int linii;
//    private int coloane;
//    private Fractie[][] matrice;
//
//    public MatriceFractie(int linii, int coloane)
//    {
//        this.linii = linii;
//        this.coloane = coloane;
//        matrice = new Fractie[linii][coloane];
//        for(int i = 0; i < this.linii; i++)
//            for(int j = 0; j < this.coloane; j++)
//            {
//                matrice[i][j] = new Fractie();
//            }
//    }
//
//    public MatriceFractie(int linii, int coloane, Fractie[] perechi)
//    {
//        this.linii = linii;
//        this.coloane = coloane;
//        matrice = new Fractie[linii][coloane];
//        for(int i = 0; i < this.linii; i++)
//            for(int j = 0; j < this.coloane; j++)
//            {
//                matrice[i][j] = new Fractie(perechi[i * coloane + j].getX(), perechi[i * coloane + j].getNumitor());
//            }
//    }
//
//    public void adunare(MatriceFractie matrice1, MatriceFractie matrice2)
//    {
//        for(int i = 0; i < matrice1.linii; i++)
//            for(int j = 0; j < matrice1.coloane; j++)
//            {
//                Pereche rezAdunare = matrice1.matrice[i][j].adunare(matrice2.matrice[i][j].getPair());
//                this.matrice[i][j].setPair(rezAdunare);
//            }
//    }
//
//    public void scadere(MatriceFractie matrice1, MatriceFractie matrice2)
//    {
//        for(int i = 0; i < matrice1.linii; i++)
//            for(int j = 0; j < matrice1.coloane; j++)
//            {
//                Pereche rezScadere = matrice1.matrice[i][j].scadere(matrice2.matrice[i][j].getPair());
//                this.matrice[i][j].setPair(rezScadere);
//            }
//    }
//
//    public void inmultireScalar(MatriceFractie matrice, int x)
//    {
//        for(int i = 0; i < matrice.linii; i++)
//            for(int j = 0; j < matrice.coloane; j++)
//            {
//                Pereche rezInmultire = matrice.matrice[i][j].inmultireScalar(x);
//                this.matrice[i][j].setPair(rezInmultire);
//            }
//    }
//
//    public void inmultire(MatriceFractie matrice1, MatriceFractie matrice2)
//    {
//        for(int i = 0; i < matrice1.linii; i++)
//            for(int j = 0; j < matrice2.coloane; j++)
//            {
//                Fractie rez = new Fractie();
//                for(int k = 0; k < matrice2.coloane; k++)
//                {
//                    Pereche mul = matrice1.matrice[i][j].inmultire(matrice2.matrice[i][j].getPair());
//                    rez.setPair(rez.adunare(mul));
//                }
//                this.matrice[i][j] = rez;
//            }
//    }
//}
