import java.util.ArrayList;

public class Panier

{
    ArrayList<Achat> panier  =new ArrayList<Achat>() ; 



    public Panier (){}

    public void  ajoutPanier(Achat a ){

        panier.add(a) ; 
        IO.println("article ajouté"); 

    }

    public void afficherPanier(){
        int i = 1;
        for (Achat a : panier){
            IO.println( i +" - "+a.afficherAchat()) ; 

        }
    }
}