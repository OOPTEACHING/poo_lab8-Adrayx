package problemaInterfata;

public interface Magazin extends Masina, ParticipantLaTrafic, Taxe {
    public void adaugareClient(Masina masina, ParticipantLaTrafic persoana, Taxe taxe);
}
