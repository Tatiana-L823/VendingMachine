    public class Getraenke {
        private String[] produkte = {"Cola", "Fanta", "Mezzo Mix", "Sprudel"};
        private double preis = 2.0;

        public void zeigeProdukte() {
            System.out.println("Wählen Sie ein Getränk:");
            for (int i = 0; i < produkte.length; i++) {
                System.out.println(i + ": " + produkte[i] + " - " + preis + " €");
            }
        }

        public void verarbeiteAuswahl(int auswahlIndex) {
            if (auswahlIndex >= 0 && auswahlIndex < produkte.length) {
                System.out.println("Sie haben " + produkte[auswahlIndex] + " gewählt.");
                System.out.println("Der Preis beträgt " + preis + " €.");
            } else {
                System.out.println("Ungültige Auswahl. Bitte geben Sie einen gültigen Index ein.");
            }
        }
    }

}
