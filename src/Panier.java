import java.util.ArrayList;

public class Panier

{
    ArrayList<Achat> panier  =new ArrayList<Achat>() ; 




    public Panier (){}

    public void  ajoutPanier(Achat a ){

        panier.add(a) ; 
        IO.println("article ajouté"); 

    }

  
public void afficherPanier() {

    IO.println("┌──────────────────────────────────────────────────────────────┐");
    IO.println("│                        PANIER D'ACHATS                       │");
    IO.println("├────┬─────────────────────────────────────────────────────────┤");
    IO.println("│ N° │ DÉTAIL DE L'ACHAT                                       │");
    IO.println("├────┼─────────────────────────────────────────────────────────┤");

    int i = 1;

    for (Achat a : panier) {
        IO.println(String.format("│ %-2d │ %-55s │",i,a.afficherAchat()));
        i++;
    }
    IO.println("└────┴─────────────────────────────────────────────────────────┘");
}

    
    public double calculerTotal() {
        double ht =  0;
   
        for (Achat a : panier) {
            ht+=a.getSousTotal() ; 
        }

        return ht ;  
    }
    public ArrayList<Achat> getPanier() {
    return panier;
}
    
}