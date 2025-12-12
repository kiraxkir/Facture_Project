

public class Article 
{
    String mNom_article ; 
    double mquantite; 


    public  Article (String nom ,  double quantite) 
    {

        this.mNom_article = nom ; 
        this.mquantite = quantite; 
    }

    public void afficherArticle() {IO.println(mNom_article +" : "+mquantite+"$");}


    public String getnom_article() {return mNom_article ; }
    
    public double getquantite() {return mquantite ;}





}