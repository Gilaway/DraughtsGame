public abstract class Piece {
    public int colonneP;
    public int ligneP;
    public char couleur;

    public Piece(int colonneP,int ligneP, char couleur){
        this.colonneP = colonneP;
        this.ligneP = ligneP;
        this.couleur = couleur;
    }

    public abstract boolean deplacementPossible(int ligne, int colonne);

    public abstract void move(int ligne, int colonne);

    public abstract String getPiece();
    public abstract char getCoul();
}

