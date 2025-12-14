


public class Catalogue {

    Article[] catalogue = new Article[20];
    int count = 0;

    public Catalogue() {

    }

    public void ajouterArticle(Article a) {
        catalogue[count] = a;
        count++;
    }

public void afficherCatalogue() {

    IO.println("┌─────────────────────────────────────────────────────────────────────────────────┐");
    IO.println("│                       CATALOGUE DES PRODUITS                                    │");
    IO.println("├────────┬───────────────────────────────┬────────┬───────────────────────────────┤");
    IO.println("│ N°     │ PRODUIT                       │ N°     │ PRODUIT                       │");
    IO.println("├────────┼───────────────────────────────┼────────┼───────────────────────────────┤");

    int colWidth = 29; 

    for (int i = 0; i < count; i += 2) {

        String left = String.format("│ %-6d │ %-"+colWidth+"s",i + 1,catalogue[i].afficherArticle());


        String right = "";
         right = String.format(" │ %-6d │ %-"+colWidth+"s │",i + 2,catalogue[i + 1].afficherArticle());
        IO.println(left + right);
      }
       IO.println("└────────┴───────────────────────────────┴────────┴───────────────────────────────┘");
      IO.println();

}


    public Article getArticle(int index) {
    return catalogue[index];
}
    



}