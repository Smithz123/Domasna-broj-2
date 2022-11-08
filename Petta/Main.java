public class Main {
    public static void main(String[] args) {
        Predmet predmet = new Predmet();
        predmet.predmet = "Programiranje";
        predmet.profesor = "Ilija Jolevski";
        predmet.krediti = 6;
        predmet.semestar = 3;

        Predmet predmet2 = new Predmet("Matematika","Sonja Mancevska",6,2);
        Predmet predmet3 = new Predmet("Angliski","Lela Ivanovska ",6);


        System.out.println("Predmetot e " + predmet.predmet +
                "\nprofesor na predmetot e " + predmet.profesor +
                "\nkrediti po predmetot se " + predmet.krediti +
                "\nsemestarot e " + predmet.semestar);
        System.out.println("Predmetot e " + predmet2.predmet +
                "\nprofesor na predmetot e " + predmet2.profesor +
                "\nkrediti po predmetot se " + predmet2.krediti +
                "\nsemestarot e " + predmet2.semestar);
        System.out.println("Predmetot e " + predmet3.predmet +
                "\nprofesor na predmetot e " + predmet3.profesor +
                "\nkrediti po predmetot se " + predmet3.krediti );

    }
}