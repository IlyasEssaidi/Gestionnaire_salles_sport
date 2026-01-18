package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {

    private Label infos;
    private Label heureActuelle;
    private ListView<SalleDeSport> listView;

    @Override
    public void start(Stage stage) {

        
        listView = new ListView<>();
        listView.setItems(FXCollections.observableArrayList(SalleData.getSalles()));

        
        listView.setCellFactory(lv -> new ListCell<>() {
            @Override
            protected void updateItem(SalleDeSport salle, boolean empty) {
                super.updateItem(salle, empty);
                if (empty || salle == null) {
                    setText(null);
                } else {
                    setText(
                        salle.getNom() +
                        (salle.estOuverte() ? "    >Ouverte" : "    >Fermée")
                    );
                }
            }
        });

        
        Label titre = new Label("Informations de la salle");
        titre.setFont(Font.font(18));

        infos = new Label("Sélectionnez une salle");
        infos.setFont(Font.font(14));

        heureActuelle = new Label();
        heureActuelle.setFont(Font.font(12));
        heureActuelle.setTextFill(Color.GRAY);

        VBox infoBox = new VBox(10, titre, infos, heureActuelle);
        infoBox.setStyle("""
                -fx-padding: 20;
                -fx-background-color: #f4f6f8;
                -fx-border-radius: 10;
                -fx-background-radius: 10;
                """);

        
        listView.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSalle, salle) -> afficherInfosSalle(salle)
        );

        
        BorderPane root = new BorderPane();
        root.setLeft(listView);
        root.setCenter(infoBox);
        root.setStyle("-fx-padding: 15;");

        stage.setTitle("Gestion des Salles de Sport - Rabat");
        stage.setScene(new Scene(root, 700, 420));
        stage.show();

        
        lancerAutoRefresh();
    }

    
    
    private void afficherInfosSalle(SalleDeSport salle) {
        if (salle == null) return;

        boolean ouverte = salle.estOuverte();

        infos.setText(
                "Nom : " + salle.getNom() + "\n" +
                "Adresse : " + salle.getAdresse() + "\n" +
                "Capacité : " + salle.getCapacite() + " personnes\n" +
                "Horaires : " + salle.getHoraires() + "\n" +
                "Statut : " + (ouverte ? "Ouverte maintenant" : "Fermée maintenant")
        );

        infos.setTextFill(ouverte ? Color.GREEN : Color.RED);
        heureActuelle.setText("Heure actuelle : " +
                LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    
    private void lancerAutoRefresh() {
        Timer timer = new Timer(true);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    listView.refresh();
                    afficherInfosSalle(listView.getSelectionModel().getSelectedItem());
                });
            }
        }, 0, 1000); 
    }

    public static void main(String[] args) {
        launch(args);
    }
}
