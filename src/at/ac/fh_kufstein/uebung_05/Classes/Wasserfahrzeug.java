package at.ac.fh_kufstein.uebung_05.Classes;

public class Wasserfahrzeug extends Fahrzeug
{
    private double tiefgang;
    private short schrauben;
    private double ladung;

    public void entladen() throws InterruptedException {
        this.ladung = 0;
        Thread.sleep(500);
    }

    //aufgabe 3
    public double getTiefgang() {
        return tiefgang;
    }

    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public short getSchrauben() {
        return schrauben;
    }

    public void setSchrauben(short schrauben) {
        this.schrauben = schrauben;
    }

    public double getLadung() {
        return ladung;
    }

    public void setLadung(double ladung) {
        this.ladung = ladung;
    }

    public Wasserfahrzeug(double tiefgang, short schrauben, double ladung, short reifen, String color, short ps, short tueren, short geschwindigkeit) {
        super(reifen, color, ps, tueren, geschwindigkeit);
        this.tiefgang = tiefgang;
        this.schrauben = schrauben;
        this.ladung = ladung;

    }
}
