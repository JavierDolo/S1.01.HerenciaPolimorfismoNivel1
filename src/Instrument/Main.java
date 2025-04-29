package Instrument;

public class Main {
    public static void main(String[] args) {

        Instrument saxophone = new WindInstrument("Saxophone", 150.0);
        Instrument guitar = new StringInstrument("Guitar", 300.0);
        Instrument drums = new PercussionInstrument("Drums", 500.0);

        saxophone.play();
        guitar.play();
        drums.play();
    }
}