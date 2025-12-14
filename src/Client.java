
public class Client 

{

    String nomclient ; 
    String numTel  ;

    public Client (String nom,String numero)
    {
        this.nomclient = nom;
        this.numTel = numero ;
    }

    public String getNomClient() {return nomclient ;}
    public String getNumeroClient() {return numTel ;}

    public void AfficherClient () {IO.println("      Nom : "+ nomclient+" |"+ " telephone : "+numTel );}

}