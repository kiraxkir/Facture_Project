


public class Catalogue {

    Article[] catalogue = new Article[3];
    int count = 0;

    public Catalogue() {

    }

    public void ajouterArticle(Article a) {
        catalogue[count] = a;
        count++;
    }

    public void afficherCatalogue() {
        for (int i = 0; i < count; i++) {
            IO.println((i + 1) + " - " + catalogue[i].afficherArticle());
        }
    }

    public Article getArticle(int index) {
    return catalogue[index];
}
    



}