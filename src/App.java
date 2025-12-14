import java.util.Scanner;


void main() {
    Scanner sc =  new Scanner(System.in) ; 
    Catalogue cat =new Catalogue() ; 

    Produit listeProduit = new Produit() ;
    listeProduit.creationCatalogue(cat); 
    Panier panier = new Panier() ; 
    IO.println();
    IO.println();
    IO.println();
    IO.println();

    IO.println("-------------------------BIENVENUE DANS NOTRE BOUTIQUE------------------------------") ; 
    IO.println("---------------Notre catalogue de produit vous es presenté si dessous : -------------------") ;
    IO.println();
    


    IO.print("Pourriez vous nous renseigner: \nvotre NOM : ");
    String nom = sc.nextLine();
    IO.print("Numero de telephone : ") ; 
    String Telephone = sc.nextLine() ; 


    



  
    cat.afficherCatalogue();

        while (true) {
            
    IO.println("┌─────────────────────────────────────────────────────────────────────────────────┐");
    IO.println("│                              OPTIONS :                                          │");
    IO.println("│                       1.ajouter un article au panier                            │");
    IO.println("│                       2.afficher le panier                                      │");
    IO.println("│                       3.Passez au payement                                      │");
    IO.println("│                       4.Annuler tout                                            │");
    IO.println("└─────────────────────────────────────────────────────────────────────────────────┘");
    IO.print("quel est votre choix") ; 
    int choix = sc.nextInt() ; 

    //le chois un est un do while, reste dans le mode panier tant que l utilisateur na pas taper 0
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
            if (choix == 3 ) 
            {
               Facture facture = new Facture(new Client(nom,Telephone),panier); 
               facture.afficherFacture();

               break;
            }
            if (choix == 2)
            {
                panier.afficherPanier();
            }
            if(choix==4){
                IO.print("Merci  avoir utiliser notre application");
            }
  



    }



}