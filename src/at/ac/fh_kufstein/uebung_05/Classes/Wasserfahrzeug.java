package at.ac.fh_kufstein.uebung_05.Classes;

public class Wasserfahrzeug
{
    private double tiefgang;
    private short schrauben;
    private double ladung;

    public void entladen() throws InterruptedException {
        this.ladung = 0;
        Thread.sleep(500);
    }
}
