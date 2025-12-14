

public class Achat {

    private Article article;
    private int quantite;

    public Achat(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public double getSousTotal() {
        return quantite * article.getprix();
    }

    public String afficherAchat() {
        return article.afficherArticle() + " x " + quantite +
               " = " + getSousTotal();
    }
    public Article getArticle(){
        return article ;
    }
    public int getqte() {return quantite;}
    
}
