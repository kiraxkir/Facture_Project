import java.util.ArrayList;

public class Panier

{
    ArrayList<Article> panier  =new ArrayList<Article>() ; 



    public Panier (){}

    public void  ajoutPanier(Article a){

        panier.add(a ) ; 
        IO.println("article ajouté"); 

    }

    public void afficherPanier(){
        for (Article a : panier)
        {
            a.afficherArticle();
        }

    }
}