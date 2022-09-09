public class EjemploMatricesSimetrica {
    public static void main(String[] args) {

        boolean simetrica = true;
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };
        int i = 0, j;
//        while (i< matriz.length && simetrica){
//            j = 0;
//            while (j < i && simetrica){
//                if(matriz[i][j] != matriz[j][i]){
//                    simetrica = false;
//                }
//                j++;
//
//            }
//            i++;
//        }

        // con for sería así:
        out:
        for (int k = 0; k < matriz.length; k++) {
            for (int l = 0; l < k; l++) {
                if(matriz[k][l] != matriz[l][k]){
                    simetrica = false;
                    break out;
                }
            }
        }

        if(simetrica){
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }

    }
}
