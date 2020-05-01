public class CaseVide extends Case {
    CaseVide(int colonne,int ligne, char couleur){
        super(colonne, ligne,couleur);
    }

    @Override
    public boolean estVide() {
        return true ;
    }

    @Override
    public Piece getPiece() {
        return null;
    }
}
