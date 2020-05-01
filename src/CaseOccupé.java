public class CaseOccupé extends Case {

    Piece pieceSurCase;

    CaseOccupé(int colonne,int ligne, char couleur, Piece pieceSurCase){
        super(colonne, ligne,couleur);
        this.pieceSurCase = pieceSurCase;
    }

    @Override
    public boolean estVide() {
        return false;
    }

    @Override
    public Piece getPiece() {
        return pieceSurCase;
    }
}
