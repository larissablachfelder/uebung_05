package at.ac.fh_kufstein.uebung_05.Classes;

public class Fahrzeug
{
    private short reifen;
    private String color;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;

    public static int anzahl;



    public void starten()
    {
        this.gestartet = true;
    }

    public void stoppen()
    {
        this.gestartet = false;
    }

    public void beschleunigen(short geschwindigkeit)
    {
       if(this.gestartet==true)
       {
           //probiere aus ob die addition kleiner wäre
           if(this.geschwindigkeit + geschwindigkeit <=250)
           {    //hier führe ich die addition erst aus
               this.geschwindigkeit += geschwindigkeit;
           }
           else
           {
               this.geschwindigkeit = 250;

           }
       }


    }

    public void bremsen(short geschwindigkeit)
    {

        if(this.gestartet==true)
        {

            if(this.geschwindigkeit - geschwindigkeit >=0)
            {
                this.geschwindigkeit -= geschwindigkeit;
            }
            else
            {
                this.geschwindigkeit = 0;

            }
        }
    }


}
