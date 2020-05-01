
public class Pion extends Piece {

    public Pion(int colonneP, int ligneP, char couleur) {
        super(colonneP, ligneP, couleur);
    }

    //prend avantage du polymorphisme : permet de directement appeler la methode : mieux
    @Override
    // essayer d'enlever le pion des parametres !!! pour prendre avantage du polymorphisme !
    public boolean deplacementPossible(int ligne, int colonne) {
        if ((Plateau.Dammier[ligne][colonne].getPiece() == null) && (Plateau.Dammier[ligne][colonne].getCouleur() == 'N')) {
            if (this.getCoul() == 'B') {
                if (ligne == this.ligneP + 1 && (colonne == this.colonneP + 1 || colonne == this.colonneP - 1)) {
                    return true;
                } else return false;
            } else if (ligne == this.ligneP - 1 && (colonne == this.colonneP + 1 || colonne == this.colonneP - 1)) {
                return  true;
            }else   return false;
        }else return false;
    }

    @Override
    public  void move(int ligne, int colonne) {
        while (colonne > 9 || ligne >9){
            System.out.println("Vous sortez du damier");
            if (ligne > 9){
                ligne = ligne -1 ;
            }
            if (colonne > 9){
                colonne = colonne - 1;
            }
        }
        boolean test = deplacementPossible(ligne,  colonne);
        boolean test1 = creerDame(ligne, colonne);
        char stock1 = Plateau.Dammier[this.ligneP][this.colonneP].getCouleur();
        char stock2 =  Plateau.Dammier[ligne][colonne].getCouleur();
        System.out.print("Déplacement ");
        if (test1){
            System.out.print("Dame crée ");
            Case remplacement = new CaseVide(this.ligneP, this.colonneP, stock1);
            Plateau.Dammier[this.ligneP][this.colonneP] = remplacement;
            Plateau.Dammier[ligne][colonne] = new CaseOccupé(ligne, colonne, stock2, new Dame(ligneP,colonneP,couleur));
            this.ligneP = ligne;
            this.colonneP = colonne;
            System.out.println("en Colonne : " + this.colonneP + " Ligne : " +this.ligneP);
            System.out.print("Dame ");
        }
        else if (test){
            Case remplacement = new CaseVide(this.ligneP, this.colonneP, stock1);
            Plateau.Dammier[this.ligneP][this.colonneP] = remplacement;
            Plateau.Dammier[ligne][colonne] = new CaseOccupé(ligne, colonne, stock2,this);
            this.ligneP = ligne;
            this.colonneP = colonne;
            System.out.println("en Colonne : " + this.colonneP + " Ligne : " +this.ligneP);
            System.out.print("Pion ");
        }
        else System.out.println("Ce mouvement n'est pas possible");
    }

    @Override
    public String getPiece() {
        return "Pion "+ getCoul() + " Colonne : " + this.colonneP + " Ligne : " + this.ligneP;
    }

    @Override
    public char getCoul() {
        return couleur;
    }
    public boolean creerDame(int ligne, int colonne){
        for (colonne = 0; colonne <= 9; colonne++){
            if ((Plateau.Dammier[ligne][colonne].getPiece() == null) && (Plateau.Dammier[ligne][colonne].getCouleur() == 'N')){
                if ((this.getCoul()=='B')){
                    if (ligne == 9){
                        return true;
                    }else return false;
                }else if (this.getCoul()=='N'){
                    if (ligne == 0){
                        return true;
                    }else return false;
                }
            }
        }return false;
    }
}
