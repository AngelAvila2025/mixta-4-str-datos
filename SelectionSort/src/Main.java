
public class Main {
    public static void main(String[] args) throws Exception {

        int[] arr = {5, 2, 8, 1, 4};
        int n = arr.length;

        // Paso 1: imprimir el arreglo desordenado
        System.out.println("Arreglo desordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("/////////////////////////////");

        // Paso 2: recorrer el arreglo
        for (int i = 0; i < n - 1; i++) {

            // Paso 3: buscar numeros menores
            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {

                    // Hacer el intercambio
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }

        // Paso 4: imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
