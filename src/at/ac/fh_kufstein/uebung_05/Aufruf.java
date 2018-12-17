package at.ac.fh_kufstein.uebung_05;

import at.ac.fh_kufstein.uebung_05.Classes.Auto;
import at.ac.fh_kufstein.uebung_05.Classes.Wasserfahrzeug;

public class Aufruf
{
    public static void main(String[] args)
    {
        Auto bmw = new Auto((short)4, (short)4, "silber", (short)220, (short)5, (short)0);
        Auto audi = new Auto((short)8, (short)4, "schwarz", (short)180, (short)5, (short)0);
        Wasserfahrzeug titanic = new Wasserfahrzeug(10.54, (short)3, (short)1000000,(short)0, "blau", (short)51000, (short)0, (short)0);



    }
}
