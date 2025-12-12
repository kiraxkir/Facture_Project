


public class Catalogue {

    Article[] catalogue = new Article[3];
    int count = 0;

    public Catalogue() {

    }

    public void ajouterArticle(Article a) {
        catalogue[count] = a;
        count++;
    }

    public void afficherCatalogue(){
    for (Article a : catalogue)
    {
        a.afficherArticle();
    }

}
}