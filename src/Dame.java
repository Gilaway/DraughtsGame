public class Dame extends Piece {

    public Dame(int colonneP, int ligneP, char couleur) {
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
                }else if (ligne == this.ligneP + 2 && (colonne == this.colonneP + 2 || colonne == this.colonneP - 2)){
                    return true;
                }else if (ligne == this.ligneP + 3 && (colonne == this.colonneP + 3 || colonne == this.colonneP - 3)){
                    return true;
                }else if (ligne == this.ligneP + 4 && (colonne == this.colonneP + 4 || colonne == this.colonneP - 4)){
                    return true;
                }else if (ligne == this.ligneP + 5 && (colonne == this.colonneP + 5 || colonne == this.colonneP - 5)){
                    return true;
                }else if (ligne == this.ligneP + 6 && (colonne == this.colonneP + 6 || colonne == this.colonneP - 6)){
                    return true;
                }else if (ligne == this.ligneP + 7 && (colonne == this.colonneP + 7 || colonne == this.colonneP - 7)){
                    return true;
                }else if (ligne == this.ligneP + 8 && (colonne == this.colonneP + 8 || colonne == this.colonneP - 8)){
                    return true;
                }else if (ligne == this.ligneP + 9 && (colonne == this.colonneP + 9 || colonne == this.colonneP - 9)){
                    return true;
                }
                else return false;
            } else if (ligne == this.ligneP - 1 && (colonne == this.colonneP + 1 || colonne == this.colonneP - 1)) {
                return  true;
            }else if (ligne == this.ligneP - 2 && (colonne == this.colonneP + 2 || colonne == this.colonneP - 2)) {
                return  true;
            }else if (ligne == this.ligneP - 3 && (colonne == this.colonneP + 3 || colonne == this.colonneP - 3)) {
                return  true;
            }else if (ligne == this.ligneP - 4 && (colonne == this.colonneP + 4 || colonne == this.colonneP - 4)) {
                return  true;
            }else if (ligne == this.ligneP - 5 && (colonne == this.colonneP + 5 || colonne == this.colonneP - 5)) {
                return  true;
            }else if (ligne == this.ligneP - 6 && (colonne == this.colonneP + 6 || colonne == this.colonneP - 6)) {
                return  true;
            }else if (ligne == this.ligneP - 7 && (colonne == this.colonneP + 7 || colonne == this.colonneP - 7)) {
                return  true;
            }else if (ligne == this.ligneP - 8 && (colonne == this.colonneP + 8 || colonne == this.colonneP - 8)) {
                return  true;
            }else if (ligne == this.ligneP - 9 && (colonne == this.colonneP + 9 || colonne == this.colonneP - 9)) {
                return  true;
            }
            else   return false;
        }else return false;
    }

    @Override
    public  void move(int ligne, int colonne) {
        boolean test = deplacementPossible(ligne,  colonne);
        char stock1 = Plateau.Dammier[this.ligneP][this.colonneP].getCouleur();
        char stock2 =  Plateau.Dammier[ligne][colonne].getCouleur();
        System.out.print("Déplacement ");
        if (test){
            Case remplacement = new CaseVide(this.ligneP, this.colonneP, stock1);
            Plateau.Dammier[this.ligneP][this.colonneP] = remplacement;
            Plateau.Dammier[ligne][colonne] = new CaseOccupé(ligne, colonne, stock2,this);
            this.ligneP = ligne;
            this.colonneP = colonne;
            System.out.println("en Colonne : " + this.colonneP + " Ligne : " +this.ligneP);
        }else System.out.println("Ce mouvement n'est pas possible");
    }

    @Override
    public String getPiece() {
        return "Dame " + getCoul() + " Colonne : " + this.colonneP + " Ligne : " + this.ligneP;
    }

    @Override
    public char getCoul() {
        return couleur;
    }
}


