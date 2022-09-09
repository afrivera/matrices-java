public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = {
                {"Pepe", "Pepa"},
                {"Josefa", "Paco"},
                {"Lucas", "Pancha"},
        };

//        ForEach
        for(String[] fila: nombres){
            for(String nombre: fila){
                System.out.println("nombre = " + nombre);
            }
            System.out.println();
        }

    }
}
