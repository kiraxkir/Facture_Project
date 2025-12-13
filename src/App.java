


void main() {
    Catalogue cat =new Catalogue() ; 

    Produit listeProduit = new Produit() ;
    listeProduit.buildCatalogue(cat); 
    Panier panier = new Panier() ; 



   
    cat.afficherCatalogue();
    panier.ajoutPanier(new Achat (cat.getArticle(1) , 10 ));
    
    panier.afficherPanier();




}