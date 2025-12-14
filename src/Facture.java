

public class Facture 

{
    private Client client; 
    private Panier panier ; 

    public Facture(Client c , Panier p) {
        this.client = c ; 
        this.panier= p ; 

    }
    public void  infoClient(Client c ) {
        client.AfficherClient() ; 
        
    }
    public void prixTotal() {
        panier.calculerTotal();
    }
    public double remise(){


        if (panier.calculerTotal() > 100 ){
            double rem = 0.3; 
            double reduction = panier.calculerTotal()*rem;
            return reduction ; 

        }
        else {
            double reduction= 0 ;
            return  reduction;
        }
    }
    public double tva(){return panier.calculerTotal()*0.16;}







public void afficherFacture() {
    double totalHT = panier.calculerTotal();
    double montantRemise = remise();
    double montantTVA = tva();
    double totalTTC = totalHT - montantRemise + montantTVA;

    IO.println("╔════════════════════════════════════════════════════════════════════════════════╗");
    IO.println("║                                    FACTURE                                     ║");
    IO.println("║                                                                                ║");
    IO.println("║                                   TP JAVA                                      ║");
    IO.println("║                                     UPC                                        ║");
    IO.println("║                              Tel :  +243 99241578                              ║");
    IO.println("╚════════════════════════════════════════════════════════════════════════════════╝");
    IO.println();
    
    IO.println("──────INFORMATIONS CLIENT ─────────────────────────────────────────────────────┐");
    client.AfficherClient();
    IO.println("└──────────────────────────────────────────────────────────────────────────────┘");
    IO.println();
    IO.println("┌─ DÉTAIL DES ARTICLES ────────────────────────────────────────────────────────┐");
    IO.println("│ N°  │ Désignation                      │ Quantité  │  P.U.  │    Total       │");
    IO.println("├─────┼──────────────────────────────────┼───────────┼────────┼───────────────┤");
    int i = 1;
    for (Achat a : panier.getPanier()) {
        String designation = a.getArticle().afficherArticle();
        int quantite = a.getqte();
        double prixUnitaire = a.getArticle().getprix();
        double sousTotal = a.getSousTotal();
        
        IO.println(String.format("│ %-3d │ %-32s │    %-6d │ %6.2f │ %13.2f │", i, designation, quantite, prixUnitaire, sousTotal));
        i++;
    }

IO.println("└─────┴──────────────────────────────────┴──────────┴────────┴───────────────┘");
    IO. println("└─────┴──────────────────────────────────┴──────────┴────────┴───────────────┘");
    IO.println();
    
    IO.println("┌──────────────────────────────────────────────────────────────────────────────┐");
    IO.println(String.format("│  Total HT (Hors Taxe)                          : %22.2f USD  │", totalHT));
    
    IO.println(String.format("│  Remise appliquée (30%%)                        : %22.2f USD  │", remise()));
    
    IO.println(String.format("│  Montant TVA (16%%)                             : %22.2f USD  │", montantTVA));
    IO.println("├──────────────────────────────────────────────────────────────────────────────┤");
    IO.println(String. format("│  NET À PAYER                                   : %22.2f USD  │", totalTTC));
    IO.println("└──────────────────────────────────────────────────────────────────────────────┘");
    IO.println("║                                                                              ║");
    IO.println("║                         Merci pour votre achat :)                            ║");
    IO.println("║                                                                              ║");
    IO.println("╚══════════════════════════════════════════════════════════════════════════════╝");
}


    
}