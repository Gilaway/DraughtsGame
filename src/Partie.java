public class Partie {

    public static void main(String[] args) {
        //Placer les pions blancs en haut et les pions noir en bas


        Plateau plateau = new Plateau();

        Plateau.Dammier[8][1] = new CaseOccupé(1,8,'N',new Pion(1,8,'B'));
        Plateau.Dammier[0][9] = new CaseOccupé(9, 0, 'N',new Dame(9,0,'B'));
        Plateau.Dammier[1][2] = new CaseOccupé(2,1,'N', new Pion(2,1,'N'));
        Plateau.Dammier[8][5] = new CaseOccupé(5,8,'N', new Pion(5,8,'N'));
        //Faire le test pion Noir pour Dame

        Piece A = Plateau.Dammier[8][1].getPiece();
        System.out.println(A.getPiece());
        A.move(9, 0);
        System.out.println(A.getPiece());
        System.out.println(A.getPiece());
        //Case c = Plateau.Dammier[8][1];
        //System.out.println("Case : " + c.getCouleur());
        /*System.out.println("-------------------------");
        Piece C = Plateau.Dammier[1][2].getPiece();
        System.out.println(C.getPiece());
        C.move(0,3);
        System.out.println(C.getPiece());
        System.out.println("-------------------------");
        Piece D = Plateau.Dammier[8][5].getPiece();
        System.out.println(D.getPiece());
        D.move(7,4);
        System.out.println(D.getPiece());*/
        System.out.println("-------------------------");
        Piece B = Plateau.Dammier[0][9].getPiece();
        System.out.println(B.getPiece());
        //Case d = Plateau.Dammier[0][9];
        //System.out.println("Case : " + d.getCouleur());
        B.move(5,4);
        System.out.println(B.getPiece());



    }
}
