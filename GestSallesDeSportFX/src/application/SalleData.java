package application;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SalleData {

    public static List<SalleDeSport> getSalles() {
        List<SalleDeSport> salles = new ArrayList<>();

        salles.add(new SalleDeSport("Fitness Park Arribat Center",
                "Carrefour des Avenues Nations-Unies, Al Abtal, Rabat",
                120,
                LocalTime.of(6, 0),
                LocalTime.of(23, 0)
        ));
        salles.add(new SalleDeSport("Fitness Park Le Carrousel",
                "Le Carrousel Mall, Avenue Chebanate, 10000 Rabat",
                115,
                LocalTime.of(6, 0),
                LocalTime.of(23, 0)
        ));
        salles.add(new SalleDeSport("M-Fitness Agdal",
                "9 Avenue Bin Al Ouidane, Agdal, Rabat",
                90,
                LocalTime.of(6, 45),
                LocalTime.of(22, 0)
        ));
        salles.add(new SalleDeSport("Rabat Barbell Club",
                "Secteur 16, bloc M1, Rabat",
                80,
                LocalTime.of(7, 0),
                LocalTime.of(22, 0)
        ));
        salles.add(new SalleDeSport("Fitnessma Rabat",
                "35 Lot Al Hanaâ, Rue Ouarfal, Rabat",
                75,
                LocalTime.of(7, 0),
                LocalTime.of(21, 30)
        ));
        salles.add(new SalleDeSport("MF Musculation & Fitness",
                "14 Av. du Liban, Rabat 10000",
                70,
                LocalTime.of(10, 0),
                LocalTime.of(22, 30)
        ));
        salles.add(new SalleDeSport("Unique Fitness Clubs",
                "Rue Chragua Groupe, Rabat 10170",
                85,
                LocalTime.of(7, 0),
                LocalTime.of(22, 0)
        ));
        salles.add(new SalleDeSport("Gold's Gym Rabat",
                "Angle Rue Raiss Mohammed Baina & Boulevard Akrach, Rabat",
                110,
                LocalTime.of(6, 0),
                LocalTime.of(23, 0)
        ));
        salles.add(new SalleDeSport("Gymstation",
                "60 Rue Jabal Oukaïmeden, Rabat 10080",
                60,
                LocalTime.of(7, 0),
                LocalTime.of(23, 0)
        ));
        salles.add(new SalleDeSport("My Gym Rabat",
                "130 Av. Laalou, Oudayas, Rabat",
                65,
                LocalTime.of(9, 0),
                LocalTime.of(21, 30)
        ));
        salles.add(new SalleDeSport("Kaiser Gym",
                "4 et 5 Résidence Aicha MAGAZIN, Rue Abdelaziz Boutaleb, Rabat 10050",
                50,
                LocalTime.of(7, 0),
                LocalTime.of(22, 0)
        ));
        salles.add(new SalleDeSport("GYM ACTION",
                "488 Rabat 10052",
                55,
                LocalTime.of(8, 0),
                LocalTime.of(22, 0)
        ));
        salles.add(new SalleDeSport("m Wellness Centers",
                "33 Av. Mehdi Ben Barka, Rabat 10000",
                100,
                LocalTime.of(7, 0),
                LocalTime.of(22, 0)
        ));
        salles.add(new SalleDeSport("Passage Fitness",
                "48 Rue Laachach, Rabat 10102",
                75,
                LocalTime.of(6, 30),
                LocalTime.of(22, 0)
        ));
        salles.add(new SalleDeSport("M Fitness (Agdal - autre site)",
                "Institut supérieur d'ingénierie et des affaires, Agdal, Rabat",
                85,
                LocalTime.of(6, 0),
                LocalTime.of(23, 0)
        ));
        salles.add(new SalleDeSport("Energy Form",
                "Rabat Kebibat, Rabat",
                70,
                LocalTime.of(7, 0),
                LocalTime.of(21, 0)
        ));
        salles.add(new SalleDeSport("Salle Agdal",
                "Rue Oued Sebou, Rabat",
                80,
                LocalTime.of(8, 0),
                LocalTime.of(21, 0)
        ));
        salles.add(new SalleDeSport("City Club Rabat",
                "Hay Riad, Avenue principale, Rabat",
                95,
                LocalTime.of(6, 0),
                LocalTime.of(22, 0)
        ));
        salles.add(new SalleDeSport("Royal Gym Rabat",
                "Avenue Mohamed V, Rabat",
                105,
                LocalTime.of(6, 0),
                LocalTime.of(22, 0)
        ));
        salles.add(new SalleDeSport("Optimum Fitness Rabat",
                "Quartier Hassan, Rabat",
                85,
                LocalTime.of(7, 0),
                LocalTime.of(22, 0)
        ));

        return salles;
    }
}
