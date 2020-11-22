package problemaInterfata;

public class Main {
    public static void main(String[] args)
    {
        DealerAuto dealer = new DealerAuto();
        Magazin magazin = null;
        Taxe taxe = null;
        ParticipantLaTrafic persoana = null;
        Masina masina = null;

        dealer.testMagazin(magazin);
        dealer.testMasina(masina);
        dealer.testParticipant(persoana);
        dealer.testTaxe(taxe);
    }
}
