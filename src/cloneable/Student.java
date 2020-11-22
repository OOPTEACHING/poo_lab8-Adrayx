package cloneable;

public class Student implements Cloneable {
    public String nume;
    public String prenume;
    public Masina masina;

    public Student(String nume, String prenume, Masina masina)
    {
        this.masina = masina;
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
