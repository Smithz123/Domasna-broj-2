public class Main {
    public static void main(String[] args) {
        Covek covek = new Covek();
        covek.ime = "Katerina";
        covek.prezime = "Runtevska";
        covek.maticenBroj = 22032002113455L;
        System.out.println("Imeto na covekot e " + covek.ime +
                "\nPrezimeto na covekot e " + covek.prezime +
                "\nMaticniot broj na covekot e " + covek.maticenBroj);
    }
}