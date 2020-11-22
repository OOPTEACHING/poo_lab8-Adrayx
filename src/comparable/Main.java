package comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Persoana[] persoane = {
           new Persoana("Mihai", "Moldovan", 20),
           new Persoana("Andrei", "Moldovan", 23),
           new Persoana("George", "Moldovan", 19)
        };

        for(int i = 0; i < persoane.length; i++)
        {
            System.out.println(persoane[i].nume);
        }
        System.out.println();
        Arrays.sort(persoane);

        for(int i = 0; i < persoane.length; i++)
        {
            System.out.println(persoane[i].nume);
        }
    }
}
