package cloneable;

public class Main {
    public static void main(String[] args)
    {
        Masina masina = new Masina("Dacia", "Gri");
        Student student1 = new Student("Moldovan", "Andrei", masina);

        Student student2 = null;
        try {
            student2 = (Student)student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Shallow: ");
        System.out.println(student1.nume + ' ' + student1.masina.culoare);
        System.out.println(student2.nume + ' ' + student2.masina.culoare);
        System.out.println();

        student2.nume = "Schimbare";
        student2.masina.revopsire("Alb");

        System.out.println(student1.nume + ' ' + student1.masina.culoare);
        System.out.println(student2.nume + ' ' + student2.masina.culoare);
        System.out.println();

        MasinaDeep masina2 = new MasinaDeep("Dacia", "Gri");
        StudentDeep student3 = new StudentDeep("Moldovan", "Andrei", masina2);

        StudentDeep student4 = null;
        try {
            student4 = (StudentDeep) student3.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Deep: ");
        System.out.println(student3.nume + ' ' + student3.masina.culoare);
        System.out.println(student4.nume + ' ' + student4.masina.culoare);
        System.out.println();

        student4.nume = "Schimbare";
        student4.masina.revopsire("Alb");

        System.out.println(student3.nume + ' ' + student3.masina.culoare);
        System.out.println(student4.nume + ' ' + student4.masina.culoare);
        System.out.println();
    }
}
