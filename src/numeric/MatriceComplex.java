//package numeric;
//
//import java.util.Arrays;
//
//public class MatriceComplex {
//    private int linii;
//    private int coloane;
//    private Complex[][] matrice;
//
//    public MatriceComplex(int linii, int coloane)
//    {
//        this.linii = linii;
//        this.coloane = coloane;
//        matrice = new Complex[linii][coloane];
//        for(int i = 0; i < this.linii; i++)
//            for(int j = 0; j < this.coloane; j++)
//            {
//                matrice[i][j] = new Complex();
//            }
//    }
//
//    public MatriceComplex(int linii, int coloane, Complex[] perechi)
//    {
//        this.linii = linii;
//        this.coloane = coloane;
//        matrice = new Complex[linii][coloane];
//        for(int i = 0; i < this.linii; i++)
//            for(int j = 0; j < this.coloane; j++)
//            {
//                matrice[i][j] = new Complex(perechi[i * coloane + j].getReal(), perechi[i * coloane + j].getImaginar());
//            }
//    }
//
//    public void adunare(MatriceComplex matrice1, MatriceComplex matrice2)
//    {
//        for(int i = 0; i < matrice1.linii; i++)
//            for(int j = 0; j < matrice1.coloane; j++)
//            {
//                Pereche rezAdunare = matrice1.matrice[i][j].adunare(matrice2.matrice[i][j].getPair());
//                this.matrice[i][j].setPair(rezAdunare);
//            }
//    }
//
//    public void scadere(MatriceComplex matrice1, MatriceComplex matrice2)
//    {
//        for(int i = 0; i < matrice1.linii; i++)
//            for(int j = 0; j < matrice1.coloane; j++)
//            {
//                Pereche rezScadere = matrice1.matrice[i][j].scadere(matrice2.matrice[i][j].getPair());
//                this.matrice[i][j].setPair(rezScadere);
//            }
//    }
//
//    public void inmultireScalar(MatriceComplex matrice, int x)
//    {
//        for(int i = 0; i < matrice.linii; i++)
//            for(int j = 0; j < matrice.coloane; j++)
//            {
//                Pereche rezInmultire = matrice.matrice[i][j].inmultireScalar(x);
//                this.matrice[i][j].setPair(rezInmultire);
//            }
//    }
//
//    public void inmultire(MatriceComplex matrice1, MatriceComplex matrice2)
//    {
//        for(int i = 0; i < matrice1.linii; i++)
//            for(int j = 0; j < matrice2.coloane; j++)
//            {
//                Complex rez = new Complex();
//                for(int k = 0; k < matrice2.coloane; k++)
//                {
//                    Pereche mul = matrice1.matrice[i][j].inmultire(matrice2.matrice[i][j].getPair());
//                    rez.setPair(rez.adunare(mul));
//                }
//                this.matrice[i][j] = rez;
//            }
//    }
//}
