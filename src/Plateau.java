public class Plateau {

    public static Case[][] Dammier = new Case[10][10];

    public Plateau(){
        for (int i = 0;i <= 9;i += 1) {
            if(i%2 == 0) {
                for (int j = 0; j <= 9; j += 2) {
                    Dammier[i][j] = new CaseVide(j, i, 'B');
                }
                for (int j = 1; j <= 9; j += 2) {
                    Dammier[i][j] = new CaseVide(j, i, 'N');
                }
            }else {
                for (int j = 1; j <= 9; j += 2) {
                    Dammier[i][j] = new CaseVide(j, i, 'B');
                }
                for (int j = 0; j <= 9; j += 2) {
                    Dammier[i][j] = new CaseVide(j, i, 'N');
                }
            }
        }
    }
}