package problemaInterfata;

public class DealerAuto implements Magazin {
    public void testTaxe(Taxe taxe)
    {
        System.out.println("A fost apelata metoda pentru taxe");
    }

    public void testMasina(Masina masina)
    {
        System.out.println("A fost apelata metoda pentru masina");
    }

    public void testParticipant(ParticipantLaTrafic persoana)
    {
        System.out.println("A fost apelata metoda pentru participantii la trafic");
    }

    public void testMagazin(Magazin magazin)
    {
        System.out.println("A fost apelata metoda pentru magazine");
    }

    @Override
    public void adaugareClient(Masina masina, ParticipantLaTrafic persoana, Taxe taxe) {
        System.out.println("Clientul va fi adaugat impreuna cu datele sale");
    }

    @Override
    public void alimentare(int distanta) {
        System.out.println("Automobilul a fost alimentat");
    }

    @Override
    public void revopsire(String color) {
        System.out.println("Automobilul va fi revopsit si va avea culoarea " + color);
    }

    @Override
    public void datePersonale() {
        System.out.println("Aici se afla datele personale are clientului");
    }

    @Override
    public void schimbareDomiciliu(String adresa) {
        System.out.println("Domiciliul a fost schimbat");
    }

    @Override
    public void plataTaxe(int pret) {
        System.out.println("Taxele in valoare de " + pret + " au fost achitate");
    }

    @Override
    public void calculImpozit(int capacitate) {
        System.out.println("Impozitul nu se poate calcula acum pentru motorul de " + capacitate + " cm3");
    }
}
