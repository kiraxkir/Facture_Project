

public class Article 
{
    String mNom_article ; 
    double mprix; 


    public  Article (String nom ,  double prix) 
    {

        this.mNom_article = nom ; 
        this.mprix = prix; 
    }

    public String afficherArticle() {
        return mNom_article +" : "+mprix+"$";
    }


    public String getnom_article() {return mNom_article ; }
    
    public double getprix() {return mprix ;}





}