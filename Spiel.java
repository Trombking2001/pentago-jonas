import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Spiel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Spielbrett meinSpielbrett;
    private Spieler spielerEins;
    private Spieler spielerZwei;
    

    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel(Spieler spielerA, Spieler spielerB, Spielbrett sSpielbrett)
    {
        meinSpielbrett  = sSpielbrett;
        spielerEins = spielerA;
        spielerZwei = spielerB;        
    }

    public void rundeSpielen()
    {
        int i;
        for(i=0;i!=18;i++){
            spielerEins.spiele();
            if(gewinnerPrüfen()==true){
                String gewinner = spielerEins;
                gewinnerAusgeben();
            }
            spielerZwei.spiele();
            if(gewinnerPrüfen()==true){
                String gewinner = spielerZwei;
                gewinnerAusgeben();
            }
        }
    }
    
    private boolean gewinnerPrüfen(){
        if(fünfInReihe==true){
            return true;
        }
        else{
            return false;
        }
    }
    
    private void gewinnerAusgeben(){
        System.out.println(gewinner);
    }
    
    private boolean fünfInReihe(){
        if((senkrecht||waagerecht||diagonal)){
            return true;
        }
        else{
            return false;
        }
    }
    
    private boolean senkrecht(){
        if((spalteEins||spalteZwei||spalteDrei||spalteVier||spalteFünf||spalteSechs)){
            return true;
        }
        else{
            return false;
        }
    }
    
    private boolean waagerecht(){
        if((zeileEins||zeileZwei||zeileDrei||zeileVier||zeileFünf||zeileSechs)){
            return true;
        }
        else {
            return false;
        }
    }
    private boolean diagonal(){
        if((diagLORU||diagLORUL||diagLORUR||diagROLU||ROLUL||ROLUR)){
            return true;
        }
        else{
            return false;
        }
    }
   
    
    
    
    private boolean spalteEins(){
        if((Spielbrett.getWert(int 1, int 1)==Spielbrett.getWert(int 1, int 2)==Spielbrett.getWert(int 1, int 3)==Spielbrett.getWert(int 1, int 4)==Spielbrett.getWert(int 1, int 5))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 1, int 2)==Spielbrett.getWert(int 1, int 3)==Spielbrett.getWert(int 1, int 4)==Spielbrett.getWert(int 1, int 5)==Spielbrett.getWert(int 1, int 6))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean spalteZwei(){
        if((Spielbrett.getWert(int 2, int 1)==Spielbrett.getWert(int 2, int 2)==Spielbrett.getWert(int 2, int 3)==Spielbrett.getWert(int 2, int 4)==Spielbrett.getWert(int 2, int 5))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 2, int 2)==Spielbrett.getWert(int 2, int 3)==Spielbrett.getWert(int 2, int 4)==Spielbrett.getWert(int 2, int 5)==Spielbrett.getWert(int 2, int 6))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean spalteDrei(){
        if((Spielbrett.getWert(int 3,int 1)==Spielbrett.getWert(int 3, int 2)==Spielbrett.getWert(int 3, int 3)==Spielbrett.getWert(int 3, int 4)==Spielbrett.getWert(int 3, int 5))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 3, int 2)==Spielbrett.getWert(int 3, int 3)==Spielbrett.getWert(int 3, int 4)==Spielbrett.getWert(int 3, int 5)==Spielbrett.getWert(int 3, int 6))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean spalteVier(){
        if((Spielbrett.getWert(int 4, int 1)==Spielbrett.getWert(int 4, int 2)==Spielbrett.getWert(int 4, int 3)==Spielbrett.getWert(int 4, int 4)==Spielbrett.getWert(int 4, int 5))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 4, int 2)==Spielbrett.getWert(int 4, int 3)==Spielbrett.getWert(int 4, int 4)==Spielbrett.getWert(int 4, int 5)==Spielbrett.getWert(int 4, int 6))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean spalteFünf(){
        if((Spielbrett.getWert(int 5, int 1)==Spielbrett.getWert(int 5, int 2)==Spielbrett.getWert(int 5, int 3)==Spielbrett.getWert(int 5, int 4)==Spielbrett.getWert(int 5, int 5))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 5, int 2)==Spielbrett.getWert(int 5, int 3)==Spielbrett.getWert(int 5, int 4)==Spielbrett.getWert(int 5, int 5)==Spielbrett.getWert(int 5, int 6))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean spalteSechs(){
        if((Spielbrett.getWert(int 6, int 1)==Spielbrett.getWert(int 6, int 2)==Spielbrett.getWert(int 6, int 3)==Spielbrett.getWert(int 6, int 4)==Spielbrett.getWert(int 6, int 5))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 6, int 2)==Spielbrett.getWert(int 6, int 3)==Spielbrett.getWert(int 6, int 4)==Spielbrett.getWert(int 6, int 5)==Spielbrett.getWert(int 6, int 6))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    
    private boolean zeileEins(){
        if((Spielbrett.getWert(int 1, int 1)==Spielbrett.getWert(int 2, int 1)==Spielbrett.getWert(int 3, int 1)==Spielbrett.getWert(int 4, int 1)==Spielbrett.getWert(int 5, int 1))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 2, int 1)==Spielbrett.getWert(int 3, int 1)==Spielbrett.getWert(int 4, int 1)==Spielbrett.getWert(int 5, int 1)==Spielbrett.getWert(int 6, int 1))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean zeineZwei(){
        if((Spielbrett.getWert(int 1, int 2)==Spielbrett.getWert(int 2, int 2)==Spielbrett.getWert(int 3, int 2)==Spielbrett.getWert(int 4, int 2)==Spielbrett.getWert(int 5, int 2))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 2, int 2)==Spielbrett.getWert(int 3, int 2)==Spielbrett.getWert(int 4, int 2)==Spielbrett.getWert(int 5, int 2)==Spielbrett.getWert(int 6, int 2))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean zeileDrei(){
        if((Spielbrett.getWert(int 1, int 3)==Spielbrett.getWert(int 2, int 3)==Spielbrett.getWert(int 3, int 3)==Spielbrett.getWert(int 4, int 3)==Spielbrett.getWert(int 5, int 3))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 2, int 3)==Spielbrett.getWert(int 3, int 3)==Spielbrett.getWert(int 4, int 3)==Spielbrett.getWert(int 5, int 3)==Spielbrett.getWert(int 6, int 3))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean zeileVier(){
        if((Spielbrett.getWert(int 1, int 4)==Spielbrett.getWert(int 2, int 4)==Spielbrett.getWert(int 3, int 4)==Spielbrett.getWert(int 4, int 4)==Spielbrett.getWert(int 5, int 4))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 2, int 4)==Spielbrett.getWert(int 3, int 4)==Spielbrett.getWert(int 4, int 4)==Spielbrett.getWert(int 5, int 4)==Spielbrett.getWert(int 6, int 4))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean zeileFünf(){
        if((Spielbrett.getWert(int 1, int 5)==Spielbrett.getWert(int 2, int 5)==Spielbrett.getWert(int 3, int 5)==Spielbrett.getWert(int 4, int 5)==Spielbrett.getWert(int 5, int 5))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 2, int 5)==Spielbrett.getWert(int 3, int 5)==Spielbrett.getWert(int 4, int 5)==Spielbrett.getWert(int 5, int 5)==Spielbrett.getWert(int 6, int 5))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean zeileSechs(){
        if((Spielbrett.getWert(int 1, int 6)==Spielbrett.getWert(int 2, int 6)==Spielbrett.getWert(int 3, int 6)==Spielbrett.getWert(int 4, int 6)==Spielbrett.getWert(int 5, int 6))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 2, int 6)==Spielbrett.getWert(int 3, int 6)==Spielbrett.getWert(int 4, int 6)==Spielbrett.getWert(int 5, int 6)==Spielbrett.getWert(int 6, int 6))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean diagLORU(){
        if((Spielbrett.getWert(int 1, int 1)==Spielbrett.getWert(int 2, int 2)==Spielbrett.getWert(int 3, int 3)==Spielbrett.getWert(int 4, int 4)==Spielbrett.getWert(int 5, int 5))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 2, int 2)==Spielbrett.getWert(int 3, int 3)==Spielbrett.getWert(int 4, int 4)==Spielbrett.getWert(int 5, int 5)==Spielbrett.getWert(int 6, int 6))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean diagLORUR(){
        if((Spielbrett.getWert(int 2, int 1)[2][1]==Spielbrett.getWert(int 3, int 2)[3][2]==Spielbrett.getWert(int 4, int 3)[4][3]==Spielbrett.getWert(int 5, int 4)[5][4]==Spielbrett.getWert(int 6, int 5)[6][5])){
            return true;
        }
        else {
            return false;
        }
    }
    private boolean diagLORUL(){
        if((Spielbrett.getWert(int 1, int 2)==Spielbrett.getWert(int 2, int 3)==Spielbrett.getWert(int 3, int 4)==Spielbrett.getWert(int 4, int 5)==Spielbrett.getWert(int 5, int 6))){
            return true;
        }
        else {
            return false;
        }
    }
    private boolean diagROLU(){
        if((Spielbrett.getWert(int 6, int 1)==Spielbrett.getWert(int 5, int 2)==Spielbrett.getWert(int 4, int 3)==Spielbrett.getWert(int 3, int 4)==Spielbrett.getWert(int 2, int 5))){
            return true;
        }
        else {
            if((Spielbrett.getWert(int 5, int 2)==Spielbrett.getWert(int 4, int 3)==Spielbrett.getWert(int 3, int 4)==Spielbrett.getWert(int 2, int 5)==Spielbrett.getWert(int 1, int 6))){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private boolean diagROLUL(){
        if((Spielbrett.getWert(int 5, int 1)==Spielbrett.getWert(int 4, int 2)==Spielbrett.getWert(int 3, int 3)==Spielbrett.getWert(int 2, int 4)==Spielbrett.getWert(int 1, int 5))){
            return true;
        }
        else {
            return false;
        }
    }
    private boolean diagROLUR(){
        if((Spielbrett.getWert(int 6, int 2)==Spielbrett.getWert(int 5, int 3)==Spielbrett.getWert(int 4, int 4)==Spielbrett.getWert(int 3, int 5)==Spielbrett.getWert(int 2, int 6))){
            return true;
        }
        else {
            return false;
        }
    }
}
