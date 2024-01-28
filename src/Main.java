//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Produkte als Array initialisieren
        String[] produkte = {"Cola", "Fanta", "Mezzo Mix", "Sprudel"};

        // Preis für die Produkte
        double preis = 2.0;

        // Benutzereingabe verarbeiten
        Scanner scanner = new Scanner(System.in);

        // Produkte anzeigen
        System.out.println("Wählen Sie ein Getränk:");

        for (int i = 0; i < produkte.length; i++) {
            System.out.println(i + ": " + produkte[i] + " - " + preis + " €");
        }

        // Benutzereingabe für das gewählte Getränk
        System.out.print("Geben Sie den Index des gewünschten Getränks ein: ");
        int auswahlIndex = scanner.nextInt();

        // Gültigkeit des Index prüfen
        if (auswahlIndex >= 0 && auswahlIndex < produkte.length) {
            // Produkt anzeigen und den Preis anzeigen
            System.out.println("Sie haben " + produkte[auswahlIndex] + " gewählt.");
            System.out.println("Der Preis beträgt " + preis + " €.");
        } else {
            System.out.println("Ungültige Auswahl. Bitte geben Sie einen gültigen Index ein.");
        }
    }
}