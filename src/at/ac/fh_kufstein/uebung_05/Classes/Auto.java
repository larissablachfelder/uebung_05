package at.ac.fh_kufstein.uebung_05.Classes;



public class Auto extends Fahrzeug
{
    private boolean klimaanlage;
    private short airbag;

    public void klimaanlageAn()
    {
        if(this.klimaanlage==true)
        {
            System.out.println("Klimaanlage ist bereits an.");
        }
        else
        {
            this.klimaanlage = true;
        }
    }

    public void klimaanlageAus()
    {
        if(this.klimaanlage==false)
        {
            System.out.println("Klimaanlage ist bereits aus.");
        }
        else
        {
            this.klimaanlage = false;

        }
    }
}
