package application;

import java.time.LocalTime;

public class SalleDeSport {

    private String nom;
    private String adresse;
    private int capacite;
    private LocalTime heureOuverture;
    private LocalTime heureFermeture;

    public SalleDeSport(String nom, String adresse, int capacite,
                        LocalTime heureOuverture, LocalTime heureFermeture) {
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = capacite;
        this.heureOuverture = heureOuverture;
        this.heureFermeture = heureFermeture;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public boolean estOuverte() {
        LocalTime maintenant = LocalTime.now();
        return maintenant.isAfter(heureOuverture) && maintenant.isBefore(heureFermeture);
    }

    public String getHoraires() {
        return heureOuverture + " - " + heureFermeture;
    }
}
