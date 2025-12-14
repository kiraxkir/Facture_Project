import java.util.Scanner;


void main() {
    Scanner sc =  new Scanner(System.in) ; 
    Catalogue cat =new Catalogue() ; 

    Produit listeProduit = new Produit() ;
    listeProduit.creationCatalogue(cat); 
    Panier panier = new Panier() ; 



   
    cat.afficherCatalogue();

    
        IO.println("| 1.ajouter un article au panier \n| 2.payer                        \n|3.afficher le panier   |");
  
     

        while (true) {
        IO.print("quel est votre choix") ; 
        int choix = sc.nextInt() ; 
            if (choix == 1 )                  
            {
                    int numProduit;

                    do {
                        IO.print("Numéro du produit (0 pour terminer) : ");
                        numProduit = sc.nextInt();

                        if (numProduit != 0) {
                            IO.print("Quelle quantité souhaitez-vous ? ");
                            int qte = sc.nextInt();

                            panier.ajoutPanier(
                                new Achat(cat.getArticle(numProduit - 1), qte)
                            );
                        }
                    } while (numProduit != 0);
            }
            if (choix == 2 ) 
            {
               Facture facture = new Facture(new Client("kira","0992415748"),panier); 
               facture.afficherFacture();
               break;
            }
            if (choix == 3)
            {
                panier.afficherPanier();
            }



    }



}