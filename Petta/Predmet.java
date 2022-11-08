public class Predmet {

    String predmet;
    String profesor;
    int krediti;
    int semestar;

    public Predmet() {
    }

    public Predmet(String predmet, String profesor, int krediti, int semestar) {
        this.predmet = predmet;
        this.profesor = profesor;
        this.krediti = krediti;
        this.semestar = semestar;
    }

    public Predmet(String predmet, String profesor, int krediti) {
        this.predmet = predmet;
        this.profesor = profesor;
        this.krediti = krediti;
    }
}
