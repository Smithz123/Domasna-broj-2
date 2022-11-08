public class Main {
    public static void main(String[] args) {
        Avtomobil avtomobil = new Avtomobil();
        avtomobil.marka = "Audi";
        avtomobil.model = "A7";
        avtomobil.kilometri = 123;

        Avtomobil avtomobil2 = new Avtomobil("Mercedes","CLS",114);

        System.out.println("Marka na avtomobil: " + avtomobil.marka +
                "\nModel na avtomobilot e " + avtomobil.model +
                "\nKilometri pominati na avtomobilot se " + avtomobil.kilometri );
        System.out.println("Marka na avtomobilot2 e " + avtomobil2.marka +
                "\n Model na avtomobilot2 e " + avtomobil2.model +
                "\nKilometri pominati na avtomobilot2 se " + avtomobil2.kilometri);
    }
}