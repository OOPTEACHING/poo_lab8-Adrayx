package numeric;

public class Main{
    public static void main(String[] args) {
        Fractie fractie1 = new Fractie(3, 9);
        Fractie fractie2 = new Fractie(4, 9);

        fractie1.simplificare(fractie1.getX(), fractie1.getY());
        System.out.println(fractie1.getX() + "/" + fractie1.getY());
    }
}
