public class EjemploMatricesBuscarElemento {
    public static void main(String[] args) {

        int[][] matrizEnteros = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elementoBuscar = 32767;
        boolean found = false;
        int i = 0, j = 0;
        buscar:
        for (i = 0; i < matrizEnteros.length; i++) {
            for (j = 0; j < matrizEnteros[i].length; j++) {
                if(matrizEnteros[i][j] == elementoBuscar){
                    found = true;
                    break buscar;
                }
            }
        }

        if(found){
            System.out.println("Encontrado: " + elementoBuscar + " en las coordenadas: "+ i + ", " + j);
        } else {
            System.out.println(elementoBuscar + " no se encontro en la matriz");
        }

    }
}
