
/**
 * Beschreiben Sie hier die Klasse Spielbrett.
 * Bildet die Spielfläche für das satanistische Spiel "Pentago"
 * @author Leon Rischkopf
 * @version 1.0
 */
public class Spielbrett
{
    // Attribute folgen..
    private int spielfeld[][] = new int[6][6];        //warum kein int? evtl noch ändern.. //geändert, ursprünglich vom Typ Kugel
    //der Array ist auf jeder Stelle per Default gleich Null => muss nicht auf Null gesetzt werden
    
    public Spielbrett()     //Konstruktor
    {
        
    }
    
    public int getWert(int x, int y)
    {
        return spielfeld[x][y];
    }

    public void setzen(Kugel eineKugel, int posX,int posY)
    {
        if (spielfeld[posX][posY] == 0)     //Prüfung, ob das Feld frei ist
        {
            spielfeld[posX][posY] = eineKugel.getFarbe();
        }
        else
        {
            System.out.println("Die Kugel muss auf ein freies Feld gesetzt werden, versuche es im nächsten Zug erneut!");
        }
    }
    
    public void drehen(String quadrant, String richtung)
    {
        if (quadrant == "LU"){drehenLU(richtung);}
        if (quadrant == "LO"){drehenLO(richtung);}
        if (quadrant == "RU"){drehenRU(richtung);}
        if (quadrant == "RO"){drehenRO(richtung);}
    }
    
    private void drehenLU(String richtung)
    {
        int dE;     //dE steht für dummyEins
        int dZ;     //dZ steht für dummyZwei
        if (richtung == "r")
        {
            dE=spielfeld[2][3];
            spielfeld[2][3]=spielfeld[0][3];
            dZ=spielfeld[2][5];
            spielfeld[2][5]=dE;
            dE=spielfeld[0][5];
            spielfeld[0][5]=dZ;
            spielfeld[0][3]=dE;
            //Ecken wurden vertauscht
            dE=spielfeld[2][4];
            spielfeld[2][4]=spielfeld[1][3];
            dZ=spielfeld[1][5];
            spielfeld[1][5]=dE;
            dE=spielfeld[0][4];
            spielfeld[0][4]=dZ;
            spielfeld[1][3]=dE;
            //Kantenmitten wurden vertauscht
        }
        
        else
        {
            dE=spielfeld[0][5];
            spielfeld[0][5]=spielfeld[0][3];
            dZ=spielfeld[2][5];
            spielfeld[2][5]=dE;
            dE=spielfeld[2][3];
            spielfeld[2][3]=dZ;
            spielfeld[0][3]=dE;
            //Ecken wurden vertauscht
            dE=spielfeld[0][4];
            spielfeld[0][4]=spielfeld[1][3];
            dZ=spielfeld[1][5];
            spielfeld[1][5]=dE;
            dE=spielfeld[2][4];
            spielfeld[2][4]=dZ;
            spielfeld[1][3]=dE;
            //Kantenmitten wurden vertauscht
        }
    }
    
    private void drehenLO(String richtung)
    {
        int dE;     //dE steht für dummyEins
        int dZ;     //dZ steht für dummyZwei
        if (richtung == "r")
        {
            dE=spielfeld[2][0];
            spielfeld[2][0]=spielfeld[0][0];
            dZ=spielfeld[2][2];
            spielfeld[2][2]=dE;
            dE=spielfeld[0][2];
            spielfeld[0][2]=dZ;
            spielfeld[0][0]=dE;
            //Ecken wurden vertauscht
            dE=spielfeld[2][1];
            spielfeld[2][1]=spielfeld[1][0];
            dZ=spielfeld[1][2];
            spielfeld[1][2]=dE;
            dE=spielfeld[0][1];
            spielfeld[0][1]=dZ;
            spielfeld[1][0]=dE;
            //Kantenmitten wurden vertauscht
        }
        
        else
        {
            dE=spielfeld[0][2];
            spielfeld[0][2]=spielfeld[0][0];
            dZ=spielfeld[2][2];
            spielfeld[2][2]=dE;
            dE=spielfeld[2][0];
            spielfeld[2][0]=dZ;
            spielfeld[0][0]=dE;
            //Ecken wurden vertauscht
            dE=spielfeld[0][1];
            spielfeld[0][1]=spielfeld[1][0];
            dZ=spielfeld[1][2];
            spielfeld[1][2]=dE;
            dE=spielfeld[2][1];
            spielfeld[2][1]=dZ;
            spielfeld[1][0]=dE;
            //Kantenmitten wurden vertauscht
        }
    }
    
    private void drehenRO(String richtung)
    {
        int dE;     //dE steht für dummyEins
        int dZ;     //dZ steht für dummyZwei
        if (richtung == "r")
        {
            dE=spielfeld[5][0];
            spielfeld[5][0]=spielfeld[3][0];
            dZ=spielfeld[5][2];
            spielfeld[5][2]=dE;
            dE=spielfeld[3][2];
            spielfeld[3][2]=dZ;
            spielfeld[3][0]=dE;
            //Ecken wurden vertauscht
            dE=spielfeld[5][1];
            spielfeld[5][1]=spielfeld[4][0];
            dZ=spielfeld[4][2];
            spielfeld[4][2]=dE;
            dE=spielfeld[3][1];
            spielfeld[3][1]=dZ;
            spielfeld[4][0]=dE;
            //Kantenmitten wurden vertauscht
        }
        
        else
        {
            dE=spielfeld[3][2];
            spielfeld[3][2]=spielfeld[3][0];
            dZ=spielfeld[5][2];
            spielfeld[5][2]=dE;
            dE=spielfeld[5][0];
            spielfeld[5][0]=dZ;
            spielfeld[3][0]=dE;
            //Ecken wurden vertauscht
            dE=spielfeld[3][1];
            spielfeld[3][1]=spielfeld[4][0];
            dZ=spielfeld[4][2];
            spielfeld[4][2]=dE;
            dE=spielfeld[5][1];
            spielfeld[5][1]=dZ;
            spielfeld[4][0]=dE;
            //Kantenmitten wurden vertauscht
        }
    }
    
    private void drehenRU(String richtung)
    {
        int dE;     //dE steht für dummyEins
        int dZ;     //dZ steht für dummyZwei
        if (richtung == "r")
        {
            dE=spielfeld[5][3];
            spielfeld[5][3]=spielfeld[3][3];
            dZ=spielfeld[5][5];
            spielfeld[5][5]=dE;
            dE=spielfeld[3][5];
            spielfeld[3][5]=dZ;
            spielfeld[3][3]=dE;
            //Ecken wurden vertauscht
            dE=spielfeld[5][4];
            spielfeld[5][4]=spielfeld[4][3];
            dZ=spielfeld[4][5];
            spielfeld[4][5]=dE;
            dE=spielfeld[3][4];
            spielfeld[3][4]=dZ;
            spielfeld[4][3]=dE;
            //Kantenmitten wurden vertauscht
        }
        
        else
        {
            dE=spielfeld[3][5];
            spielfeld[3][5]=spielfeld[3][3];
            dZ=spielfeld[5][5];
            spielfeld[5][5]=dE;
            dE=spielfeld[5][3];
            spielfeld[5][3]=dZ;
            spielfeld[3][3]=dE;
            //Ecken wurden vertauscht
            dE=spielfeld[3][4];
            spielfeld[3][4]=spielfeld[4][3];
            dZ=spielfeld[4][5];
            spielfeld[4][5]=dE;
            dE=spielfeld[5][4];
            spielfeld[5][4]=dZ;
            spielfeld[4][3]=dE;
            //Kantenmitten wurden vertauscht
        }
    }
}

