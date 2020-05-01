public abstract class Case {

        int colonne;
        int ligne;
        char couleur;


        public Case(int colonne,int ligne, char couleur){
            this.colonne = colonne;
            this.ligne = ligne;
            this.couleur = couleur;
        }
        public abstract boolean estVide();
        public abstract Piece getPiece();
        public char getCouleur() {
            return couleur;
        }
    }


