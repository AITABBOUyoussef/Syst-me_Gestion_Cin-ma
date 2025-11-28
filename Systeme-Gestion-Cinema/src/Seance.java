public class Seance {
    public int id;
    public int filmId;
    public String date;
    public String heure;
    public String salle;
    public int capacite;

    public Seance(int id, int filmId, String date, String heure, String salle, int capacite) {
        this.id = id;
        this.filmId = filmId;
        this.date = date;
        this.heure = heure;
        this.salle = salle;
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "[" + id + "] Film:" + filmId
                + " | " + date + " " + heure
                + " | Salle:" + salle
                + " | Capacité:" + capacite;
    }
}
