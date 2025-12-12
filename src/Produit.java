

public class Produit 
{
    public static void buildCatalogue(Catalogue cat) 
    {
        
        cat.ajouterArticle(new Article("Riz", 12.5));
        cat.ajouterArticle(new Article("Sucre", 2.2));
        cat.ajouterArticle(new Article("Lait", 1.4));

    }


}