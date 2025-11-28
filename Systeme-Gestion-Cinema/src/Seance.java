public class Seance {
    private int id;
    private int idFilm;
    private String date;
    private String heure;
    private String salle;
    private int capacite;

    public Seance(int id, int idFilm, String date, String heure, String salle, int capacite) {
        this.id = id;
        this.idFilm = idFilm;
        this.date = date;
        this.heure = heure;
        this.salle = salle;
        this.capacite = capacite;
    }

    public int getId() { return id; }
    public int getIdFilm() { return idFilm; }
    public String getDate() { return date; }
    public String getHeure() { return heure; }
    public String getSalle() { return salle; }
    public int getCapacite() { return capacite; }

    @Override
    public String toString() {
        return String.format("[%d] Film:%d | %s %s | Salle:%s | Capacité:%d",
                id, idFilm, date, heure, salle, capacite);
    }
}