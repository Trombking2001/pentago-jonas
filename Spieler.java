
/**
 * Beschreiben Sie hier die Klasse Spieler.
 * Erlaubt dem menschlichen Spieler zu spielen
 * @author Leon Rischkopf 
 * @version 1.0
 */
public class Spieler
{
    //private boolean istMensch;    //ohne AI irrelevant
    private Kugel meineKugel;
    
    public Spieler(int farbe)
    {
        meineKugel= new Kugel(farbe);
    }
    
    public void spiele(int X, int Y, String q, String r, Spielbrett meinSpielbrett)
    {
        meinSpielbrett.setzen(meineKugel, X, Y);
        meinSpielbrett.drehen(q,r);
    }
}
