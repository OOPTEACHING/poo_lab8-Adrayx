package comparable;

public class Persoana implements Comparable<Persoana>{
    public String nume;
    public String prenume;
    public int varsta;

    public Persoana(String nume, String prenume, int varsta)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    @Override
    public int compareTo(Persoana p) {
        //return this.nume.compareTo(p.nume);
        if(this.varsta > p.varsta)
            return -1;
        else if(this.varsta < p.varsta)
            return 1;
        else
            return 0;
    }
}
