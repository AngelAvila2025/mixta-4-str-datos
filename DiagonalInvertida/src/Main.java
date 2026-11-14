public class Main {
    public static void main(String[] args) {

        for (int fila = 1; fila <= 5; fila++) {

            for (int columna = 1; columna <= 5; columna++) {

                if (fila + columna == 6) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}